package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * @author Akuma
 * @date 2021/4/7 11:02
 */
@Data
public class EquipmentProduce {

    /**
     * id
     */
    private Integer id;

    /**
     * 建造时间
     */
    private String time;

    /**
     * 装备名称
     */
    private String name;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 类型
     */
    private String type;

}
