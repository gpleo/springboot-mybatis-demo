package com.gopersist.demo.mybatis.service;

import com.gopersist.demo.mybatis.entity.User;

/**
 * 用户服务
 * @author leo
 */
public interface UserService {
    /**
     * 获取用户信息
     * @param id
     * @return
     */
    User findOne(Long id);

    /**
     * 创建用户
     * @param user
     * @return
     */
    boolean create(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    boolean update(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean delete(Long id);
}
