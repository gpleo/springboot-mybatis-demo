package com.gopersist.demo.mybatis.service.impl;

import com.gopersist.demo.mybatis.dao.UserDao;
import com.gopersist.demo.mybatis.entity.User;
import com.gopersist.demo.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findOne(Long id) {
        return this.userDao.findOne(id);
    }

    @Override
    public boolean create(User user) {
        int affNum = this.userDao.create(user);
        return affNum > 0;
    }

    @Override
    public boolean update(User user) {
        int affNum = this.userDao.update(user);
        return affNum > 0;
    }

    @Override
    public boolean delete(Long id) {
        int affNum = this.userDao.delete(id);
        return affNum > 0;
    }
}
