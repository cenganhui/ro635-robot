package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Akuma
 * @date 2021/4/5 16:25
 */
@Repository
public interface TestDao {

    Test getTestById(@Param("id") Integer id);

}
