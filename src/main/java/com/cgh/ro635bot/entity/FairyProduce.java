package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * 妖精建造
 *
 * @author Akuma
 * @date 2021/4/6 16:00
 */
@Data
public class FairyProduce {

    // id
    private Integer id;

    // 建造时间
    private String time;

    // 妖精名称
    private String name;

}
