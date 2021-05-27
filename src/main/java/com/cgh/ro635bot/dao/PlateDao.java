package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.Plate;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Akuma
 * @date 2021/5/27 12:34
 */
@Repository
public interface PlateDao {

    /**
     * 获取所有攻略板块
     *
     * @return 攻略板块List
     */
    List<Plate> findAllPlate();

    /**
     * 根据名称查询攻略
     *
     * @param title 板块名称
     * @return 攻略板块
     */
    Plate findPlateByTitle(@Param("title") String title);

}
