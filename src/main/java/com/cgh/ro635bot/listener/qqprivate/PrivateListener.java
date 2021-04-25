package com.cgh.ro635bot.listener.qqprivate;

import com.cgh.ro635bot.Constants;
import com.cgh.ro635bot.listener.qqgroup.GroupListener;
import com.mysql.cj.util.StringUtils;
import love.forte.simbot.annotation.Filter;
import love.forte.simbot.annotation.OnPrivate;
import love.forte.simbot.api.message.MessageContent;
import love.forte.simbot.api.message.MessageContentBuilder;
import love.forte.simbot.api.message.MessageContentBuilderFactory;
import love.forte.simbot.api.message.events.PrivateMsg;
import love.forte.simbot.api.message.results.GroupList;
import love.forte.simbot.api.message.results.SimpleGroupInfo;
import love.forte.simbot.api.sender.MsgSender;
import love.forte.simbot.filter.MatchType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 私聊监听
 *
 * @author Akuma
 * @date 2021/4/25 14:39
 */
@Service
public class PrivateListener {

    /**
     * 消息构造工厂
     */
    private final MessageContentBuilderFactory messageContentBuilderFactory;

    @Autowired
    public PrivateListener(MessageContentBuilderFactory messageContentBuilderFactory) {
        this.messageContentBuilderFactory = messageContentBuilderFactory;
    }

    /**
     * 日志
     */
    private static final Logger LOG = LoggerFactory.getLogger(GroupListener.class);

    /**
     * 日志时间格式
     */
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(Constants.DATE_FORMAT);

    /**
     * 群发更新信息
     *
     * @param privateMsg
     * @param msgSender
     */
    @OnPrivate
    @Filter(value = "update", matchType = MatchType.STARTS_WITH, trim = true)
    public void groupSendUpdateInfo(PrivateMsg privateMsg, MsgSender msgSender) {
        MessageContentBuilder builder = messageContentBuilderFactory.getMessageContentBuilder();
        try {
            // 获取消息中的图片url
            MessageContent msgContent = privateMsg.getMsgContent();
            String imageUrl = msgContent.getCats(Constants.CAT_TYPE_IMAGE).get(0).get(Constants.NEKO_IMAGE_URL);
//            System.out.println(imageUrl);
            if (!StringUtils.isNullOrEmpty(imageUrl)) {
                // 获取QQ群列表
                GroupList groupList = msgSender.GETTER.getGroupList();
                // 构建消息内容
                MessageContent msg = builder.text(Constants.UPDATE_INFO_WORDS).imageUrl(imageUrl).build();
                // 遍历群发
                for (SimpleGroupInfo groupInfo : groupList) {
//                    System.out.println(groupInfo.getGroupCode());
                    msgSender.SENDER.sendGroupMsg(groupInfo.getGroupCode(), msg);
                }
                LOG.info("群发更新信息success，时间：{}", DATE_FORMAT.format(new Date()));
            }
        } catch (Exception e) {
            MessageContent msg = builder.text(Constants.GROUP_SEND_FAILURE).build();
            msgSender.SENDER.sendPrivateMsg(privateMsg, msg);
            LOG.info("群发更新信息failure，时间：{}", DATE_FORMAT.format(new Date()));
        }
    }

}
