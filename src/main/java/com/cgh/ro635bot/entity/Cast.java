package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * 预报数据
 *
 * @author Akuma
 * @date 2021/4/7 20:28
 */
@Data
public class Cast {

    /**
     * 日期
     */
    private String date;

    /**
     * 白天天气气象
     */
    private String dayWeather;

    /**
     * 晚上天气气象
     */
    private String nightWeather;

    /**
     * 白天温度
     */
    private String dayTemp;

    /**
     * 晚上温度
     */
    private String nightTemp;

}
