package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * 攻略
 *
 * @author Akuma
 * @date 2021/5/27 12:27
 */
@Data
public class Strategy {

    /**
     * id
     */
    private Integer id;

    /**
     * 所属板块id
     */
    private Integer plateId;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接
     */
    private String url;

}
