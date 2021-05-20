package com.cgh.ro635bot.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cgh.ro635bot.Constants;
import com.cgh.ro635bot.entity.Cast;
import com.cgh.ro635bot.entity.WeatherInfo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 天气预报工具类
 *
 * @author Akuma
 * @date 2021/4/7 19:49
 */
@Data
@Component
@ConfigurationProperties(prefix = "weather")
public class WeatherUtil {

    /**
     * API KEY
     */
    private String key;

    /**
     * 调用高德地图Web API获取天气预报
     *
     * @param cityCode 城市code
     * @return 天气预报json
     */
    public String getWeather(String cityCode) {
        int codeLength = cityCode.length();
        if (6 != codeLength) {
            return "500";
        }
        StringBuilder sb = new StringBuilder();
        try {
            String weather_url = Constants.WEATHER_SERVICE_URL + cityCode + "&key=" + key + "&extensions=all";
            System.out.println(weather_url);
            URL url = new URL(weather_url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
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
     * 解析天气预报json
     *
     * @param weatherInfoJson 天气预报json
     * @return 天气信息
     */
    public WeatherInfo getWeatherInfo(String weatherInfoJson) {
        if ("500".equals(weatherInfoJson)) {
            return null;
        }
        JSONObject dataOfJson = JSONObject.parseObject(weatherInfoJson);
//        System.out.println(dataOfJson);
        // 创建WeatherInfo对象，提取所需的天气信息
        WeatherInfo weatherInfo = new WeatherInfo();
        // 从json数据中提取数据
        JSONArray forecasts = dataOfJson.getJSONArray("forecasts");
        JSONObject forecast = forecasts.getJSONObject(0);
        weatherInfo.setCity(forecast.getString("city"));
        weatherInfo.setReportTime("预报发布时间：" + forecast.getString("reporttime"));

        List<Cast> castList = new ArrayList<>();
        JSONArray casts = forecast.getJSONArray("casts");
        // 获取今明两天的天气预报数据
        for (int i = 0; i < 2; i++) {
            JSONObject castJson1 = casts.getJSONObject(i);
            Cast cast = new Cast();
            cast.setDate("日期：" + castJson1.getString("date") + " 周" + castJson1.getString("week"));
            cast.setDayWeather("白天天气气象：" + castJson1.getString("dayweather"));
            cast.setNightWeather("晚上天气气象：" + castJson1.getString("nightweather"));
            cast.setDayTemp("白天温度：" + castJson1.getString("daytemp") + "℃");
            cast.setNightTemp("晚上温度：" + castJson1.getString("nighttemp") + "℃");
            castList.add(cast);
        }
        weatherInfo.setCasts(castList);
        return weatherInfo;
    }

}
