package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.WeatherCity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Akuma
 * @date 2021/4/8 18:40
 */
@Repository
public interface WeatherCityDao {
    /**
     * 根据城市名称查询城市信息
     * @param name 城市名称
     * @return 城市信息
     */
    WeatherCity findWeatherCityByName(@Param("name") String name);

}
