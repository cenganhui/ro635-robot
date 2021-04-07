package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.FairyProduce;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Akuma
 * @date 2021/4/6 16:01
 */
@Repository
public interface FairyProduceDao {

    /**
     * 根据时间查询妖精建造
     *
     * @param time 时间
     * @return 妖精
     */
    public List<FairyProduce> findAllFairyProduceByTime(@Param("time") String time);

}
