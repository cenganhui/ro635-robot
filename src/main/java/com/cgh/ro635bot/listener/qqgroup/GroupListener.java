package com.cgh.ro635bot.listener.qqgroup;

import com.cgh.ro635bot.Constants;
import com.cgh.ro635bot.dao.*;
import com.cgh.ro635bot.entity.*;
import love.forte.simbot.annotation.Filter;
import love.forte.simbot.annotation.ListenBreak;
import love.forte.simbot.annotation.OnGroup;
import love.forte.simbot.annotation.Priority;
import love.forte.simbot.api.message.MessageContent;
import love.forte.simbot.api.message.MessageContentBuilder;
import love.forte.simbot.api.message.MessageContentBuilderFactory;
import love.forte.simbot.api.message.events.GroupMsg;
import love.forte.simbot.api.sender.MsgSender;
import love.forte.simbot.constant.PriorityConstant;
import love.forte.simbot.filter.MatchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * QQ群聊监听
 *
 * @author Akuma
 * @date 2021/4/6 13:57
 */
@Service
public class GroupListener {

    // 消息构建工厂
    private final MessageContentBuilderFactory messageContentBuilderFactory;

    @Autowired
    public GroupListener(MessageContentBuilderFactory messageContentBuilderFactory) {
        this.messageContentBuilderFactory = messageContentBuilderFactory;
    }

    @Autowired
    private InteractiveWordsDao interactiveWordsDao;

    @Autowired
    private FigurineProduceDao figurineProduceDao;

    @Autowired
    private EquipmentProduceDao equipmentProduceDao;

    @Autowired
    private FairyProduceDao fairyProduceDao;

    @Autowired
    private RandomPictureDao randomPictureDao;


    /**
     * 计算概率
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "rd", matchType = MatchType.STARTS_WITH, trim = true)
    @ListenBreak
    public void calRandom(GroupMsg groupMsg, MsgSender msgSender) {
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        String[] originalStr = Objects.requireNonNull(groupMsg.getText()).split(" ");
        // text拼接
        String newStr = originalStr[originalStr.length - 1] + Constants.CAL_RANDOM_WORDS1 + rand;
        if (rand <= 25) {
            newStr += Constants.CAL_RANDOM_WORDS2;
        } else if (rand <= 50) {
            newStr += Constants.CAL_RANDOM_WORDS3;
        } else if (rand <= 75) {
            newStr += Constants.CAL_RANDOM_WORDS4;
        } else {
            newStr += Constants.CAL_RANDOM_WORDS5;
        }
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(newStr).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 日常互动
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "ro", matchType = MatchType.EQUALS, trim = true)
    public void InteractiveWithRO635(GroupMsg groupMsg, MsgSender msgSender) {
        InteractiveWords interactiveWords = interactiveWordsDao.getRandomInteractiveWords();
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(interactiveWords.getWords()).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 人形建造查询
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "qfi", matchType = MatchType.STARTS_WITH, trim = true)
    public void queryFigurineProduce(GroupMsg groupMsg, MsgSender msgSender) {
        String query = getQuery(Objects.requireNonNull(groupMsg.getText()));
        List<FigurineProduce> figurineProduces = figurineProduceDao.findAllFigurineProduceByTime(query);
        // text拼接
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constants.QUERY_PRODUCE);
        if (figurineProduces.size() != 0) {
            // 查询有结果
            for (int i = 0; i < figurineProduces.size(); i++) {
                FigurineProduce temp = figurineProduces.get(i);
                stringBuilder.append(temp.getTime())
                        .append(" | ")
                        .append(temp.getName())
                        .append(" | ")
                        .append(temp.getLevel())
                        .append(" | ")
                        .append(temp.getType())
                        .append(" | ")
                        .append(temp.getHeavy());
                if (i != figurineProduces.size() - 1) {
                    stringBuilder.append("\n");
                }
            }
        } else {
            //查询无结果
            stringBuilder.append(Constants.QUERY_PRODUCE_FAIL);
        }
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(stringBuilder.toString()).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 装备建造查询
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "qeq", matchType = MatchType.STARTS_WITH, trim = true)
    public void queryEquipmentProduce(GroupMsg groupMsg, MsgSender msgSender) {
        String query = getQuery(Objects.requireNonNull(groupMsg.getText()));
        List<EquipmentProduce> equipmentProduces = equipmentProduceDao.findAllEquipmentProduceByTime(query);
        // text拼接
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constants.QUERY_PRODUCE);
        if (equipmentProduces.size() != 0) {
            // 查询有结果
            for (int i = 0; i < equipmentProduces.size(); i++) {
                EquipmentProduce temp = equipmentProduces.get(i);
                stringBuilder.append(temp.getTime())
                        .append(" | ")
                        .append(temp.getName())
                        .append(" | ")
                        .append(temp.getLevel())
                        .append(" | ")
                        .append(temp.getType());
                if (i != equipmentProduces.size() - 1) {
                    stringBuilder.append("\n");
                }
            }
        } else {
            // 查询无结果
            stringBuilder.append(Constants.QUERY_PRODUCE_FAIL);
        }
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(stringBuilder.toString()).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 妖精建造查询
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "qfa", matchType = MatchType.STARTS_WITH, trim = true)
    public void queryFairyProduce(GroupMsg groupMsg, MsgSender msgSender) {
        String query = getQuery(Objects.requireNonNull(groupMsg.getText()));
        List<FairyProduce> fairyProduces = fairyProduceDao.findAllFairyProduceByTime(query);
        // text拼接
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constants.QUERY_PRODUCE);
        if (fairyProduces.size() != 0) {
            // 查询有结果
            for (int i = 0; i < fairyProduces.size(); i++) {
                stringBuilder.append(fairyProduces.get(i).getTime())
                        .append(" | ")
                        .append(fairyProduces.get(i).getName());
                if (i != fairyProduces.size() - 1) {
                    stringBuilder.append("\n");
                }
            }
        } else {
            //查询无结果
            stringBuilder.append(Constants.QUERY_PRODUCE_FAIL);
        }
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(stringBuilder.toString()).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 图图
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "pic", matchType = MatchType.EQUALS, trim = true)
    public void randomPicture(GroupMsg groupMsg, MsgSender msgSender) {
        RandomPicture randomPicture = randomPictureDao.getRandomPicture();
        String path = Constants.RANDOM_PICTURE_FILEPATH_PREFIX + randomPicture.getPid() + Constants.RANDOM_PICTURE_FILEPATH_SUFFIX;
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(Constants.RANDOM_PICTURE_WORDS1).image(path).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 早上好
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "早", matchType = MatchType.EQUALS, trim = true)
    public void goodMorning(GroupMsg groupMsg, MsgSender msgSender) {
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(Constants.GOOD_MORNING).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 告白
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "喜欢你", matchType = MatchType.EQUALS, trim = true)
    public void expressRO635(GroupMsg groupMsg, MsgSender msgSender) {
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(Constants.EXPRESSION).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 获取帮助信息（基础指令）
     *
     * @param groupMsg
     * @param msgSender
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "help", matchType = MatchType.EQUALS, trim = true)
    public void helpInformation(GroupMsg groupMsg, MsgSender msgSender) {
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(Constants.HELP_TEXT).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
    }

    /**
     * 查询时获取查询关键字
     *
     * @param original 原指令
     * @return 查询关键字
     */
    private String getQuery(String original) {
        String[] str = original.split(" ");
        return str[str.length - 1];
    }

}
