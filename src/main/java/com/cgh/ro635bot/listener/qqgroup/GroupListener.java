package com.cgh.ro635bot.listener.qqgroup;

import com.cgh.ro635bot.Constants;
import com.cgh.ro635bot.dao.*;
import com.cgh.ro635bot.entity.*;
import com.cgh.ro635bot.utils.WeatherUtil;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    /**
     * 消息构造工厂
     */
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

    @Autowired
    private WeatherCityDao weatherCityDao;

    @Autowired
    private WeatherUtil weatherUtil;

    /**
     * 日志
     */
    private static final Logger LOG = LoggerFactory.getLogger(GroupListener.class);

    /**
     * 日志时间格式
     */
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(Constants.DATE_FORMAT);


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
        LOG.info("计算概率success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("日常互动success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("人形建造查询success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("装备建造查询success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("妖精建造查询success，时间：{}", DATE_FORMAT.format(new Date()));
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
        String path = Constants.RANDOM_PICTURE_FILEPATH_PREFIX + randomPicture.getPid();
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        MessageContent msg = builder.text(Constants.RANDOM_PICTURE_WORDS1).image(path).build();
        msgSender.SENDER.sendGroupMsg(groupMsg, msg);
        LOG.info("图图success，时间：{}", DATE_FORMAT.format(new Date()));
    }

    /**
     * 天气查询
     */
    @Priority(PriorityConstant.FIRST)
    @OnGroup
    @Filter(atBot = true, value = "wea", matchType = MatchType.STARTS_WITH, trim = true)
    public void sendWeatherInfo(GroupMsg groupMsg, MsgSender msgSender) {
        String query = getQuery(Objects.requireNonNull(groupMsg.getText()));
        WeatherCity weatherCity = weatherCityDao.findWeatherCityByName(query);
        if (weatherCity != null) {
            // 查询到该城市的code
            String weatherInfoJson = weatherUtil.getWeather(weatherCity.getCode());
            WeatherInfo weatherInfo = weatherUtil.getWeatherInfo(weatherInfoJson);
            if (weatherInfo != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("指挥官，这是")
                        .append(weatherInfo.getCity())
                        .append("的天气预报。\n\n")
                        .append(weatherInfo.getReportTime())
                        .append("\n\n");
                for (Cast cast : weatherInfo.getCasts()) {
                    stringBuilder.append(cast.getDate()).append("\n")
                            .append(cast.getDayWeather()).append("\n")
                            .append(cast.getNightWeather()).append("\n")
                            .append(cast.getDayTemp()).append("\n")
                            .append(cast.getNightTemp()).append("\n");
                }
                MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
                MessageContent msg = builder.text(stringBuilder.toString()).build();
                msgSender.SENDER.sendGroupMsg(groupMsg, msg);
                LOG.info("城市查询success，天气查询success，时间：{}", DATE_FORMAT.format(new Date()));
            }
        } else {
            // 没有查询到该城市的code
            MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
            MessageContent msg = builder.text(Constants.WEATHER_CITY_NAME_QUERY_FAIL).build();
            msgSender.SENDER.sendGroupMsg(groupMsg, msg);
            LOG.info("无匹配城市，时间：{}", DATE_FORMAT.format(new Date()));
        }
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
        LOG.info("早上好success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("告白success，时间：{}", DATE_FORMAT.format(new Date()));
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
        LOG.info("获取帮助信息（基础指令）success，时间：{}", DATE_FORMAT.format(new Date()));
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
