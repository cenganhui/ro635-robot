package com.cgh.ro635bot.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cgh.ro635bot.Constants;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * 聊天工具类
 *
 * @author Akuma
 * @date 2021/5/20 12:03
 */
@Data
@Component
@ConfigurationProperties(prefix = "tian")
public class ChatUtil {

    /**
     * API KEY
     */
    private String key;

    /**
     * 调用天行机器人API
     *
     * @param question 提问
     * @return 回应json
     */
    public String getReply(String question) {
        StringBuilder sb = new StringBuilder();
        try {
            String tian_url = Constants.TIAN_SERVICE_URL + "key=" + key + "&question=" + question;
            System.out.println(tian_url);
            URL url = new URL(tian_url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.setRequestMethod("GET");
            connection.connect();
            // 读取URL的响应
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null)
                sb.append(line).append(" ");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * 解析回应json
     *
     * @param replyJson 回应json
     * @return 回应字符串
     */
    public String getReplyString(String replyJson) {
        JSONObject dataOfJson = JSONObject.parseObject(replyJson);
        JSONArray newslist = dataOfJson.getJSONArray("newslist");
        JSONObject reply = newslist.getJSONObject(0);
        return reply.getString("reply");
    }

}
