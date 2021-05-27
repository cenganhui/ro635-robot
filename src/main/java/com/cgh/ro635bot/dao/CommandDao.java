package com.cgh.ro635bot.dao;

import com.cgh.ro635bot.entity.Command;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Akuma
 * @date 2021/5/27 13:02
 */
@Repository
public interface CommandDao {

    /**
     * 获取所有命令名称
     *
     * @return 命令List
     */
    List<Command> findAllCommand();

}
