package com.gopersist.demo.mybatis.dao;

import com.gopersist.demo.mybatis.entity.User;

/**
 * 用户操作
 * @author leo
 */
public interface UserDao {
    /**
     * 查找数据
     * @param id
     * @return
     */
    User findOne(Long id);

    /**
     * 创建数据
     * @param user
     * @return
     */
    int create(User user);

    /**
     * 更新数据
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(Long id);

}
