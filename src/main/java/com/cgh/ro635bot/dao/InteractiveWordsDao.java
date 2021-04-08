package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.InteractiveWords;
import org.springframework.stereotype.Repository;

/**
 * @author Akuma
 * @date 2021/4/6 14:01
 */
@Repository
public interface InteractiveWordsDao {

    /**
     * 随机获取一个互动台词
     *
     * @return 台词
     */
    InteractiveWords getRandomInteractiveWords();

}
