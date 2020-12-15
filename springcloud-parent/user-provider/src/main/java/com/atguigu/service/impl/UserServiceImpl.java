package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Symon
 * @version 1.0
 * @className UserServiceImpl
 * @description TODO
 * @date 2020/12/14 14:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /***
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    public User findByUserId(Integer id) {
        return userDao.findById(id).get();
    }
}
