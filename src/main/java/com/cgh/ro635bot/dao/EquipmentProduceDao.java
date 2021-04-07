package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.EquipmentProduce;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Akuma
 * @date 2021/4/7 11:04
 */
@Repository
public interface EquipmentProduceDao {

    /**
     * 根据时间查询装备建造
     *
     * @param time 时间
     * @return 装备
     */
    public List<EquipmentProduce> findAllEquipmentProduceByTime(@Param("time") String time);

}
