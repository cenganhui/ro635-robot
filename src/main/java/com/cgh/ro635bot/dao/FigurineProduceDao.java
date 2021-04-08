package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.FigurineProduce;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Akuma
 * @date 2021/4/7 10:43
 */
@Repository
public interface FigurineProduceDao {

    /**
     * 根据时间查询人形建造
     *
     * @param time 时间
     * @return 人形
     */
    List<FigurineProduce> findAllFigurineProduceByTime(@Param("time") String time);

}
