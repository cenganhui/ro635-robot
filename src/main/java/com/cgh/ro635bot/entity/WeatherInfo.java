package com.cgh.ro635bot.entity;

import lombok.Data;

import java.util.List;

/**
 * 天气信息
 *
 * @author Akuma
 * @date 2021/4/7 19:48
 */
@Data
public class WeatherInfo {

    /**
     * 城市名
     */
    private String city;

    /**
     * 预报发布时间
     */
    private String reportTime;

    /**
     * 预报list
     */
    private List<Cast> casts;

}
