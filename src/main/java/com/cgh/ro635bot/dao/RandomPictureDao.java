package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.RandomPicture;
import org.springframework.stereotype.Repository;

/**
 * @author Akuma
 * @date 2021/4/7 12:22
 */
@Repository
public interface RandomPictureDao {

    /**
     * 随机获取一张图片
     *
     * @return 图片
     */
    RandomPicture getRandomPicture();

}
