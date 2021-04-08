package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * 城市信息
 *
 * @author Akuma
 * @date 2021/4/8 18:39
 */
@Data
public class WeatherCity {

    /**
     * id
     */
    private Integer id;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 城市code
     */
    private String code;

}
