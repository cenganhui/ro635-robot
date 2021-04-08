package com.cgh.ro635bot.entity;

import lombok.Data;

/**
 * RO635日常互动台词
 *
 * @author Akuma
 * @date 2021/4/6 13:59
 */
@Data
public class InteractiveWords {

    /**
     * id
     */
    private Integer id;

    /**
     * 台词
     */
    private String words;

}
