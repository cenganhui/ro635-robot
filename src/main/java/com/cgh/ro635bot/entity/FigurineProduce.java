package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * 人形建造
 *
 * @author Akuma
 * @date 2021/4/7 10:37
 */
@Data
public class FigurineProduce {

    // id
    private Integer id;

    // 建造时间
    private String time;

    // 人形名称
    private String name;

    // 星级
    private Integer level;

    // 类型
    private String type;

    // 是否重建
    private Integer heavy;

}
