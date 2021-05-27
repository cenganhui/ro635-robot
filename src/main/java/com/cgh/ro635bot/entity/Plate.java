package com.cgh.ro635bot.entity;

import lombok.Data;

import java.util.List;

/**
 * 攻略板块
 *
 * @author Akuma
 * @date 2021/5/27 12:26
 */
@Data
public class Plate {

    /**
     * id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 攻略List
     */
    private List<Strategy> strategies;

}
