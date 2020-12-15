package com.atguigu.service;

import com.atguigu.domain.User;

/**
 * @author Symon
 * @version 1.0
 * @className UserService
 * @description TODO
 * @date 2020/12/14 14:26
 */
public interface UserService {
    /***
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User findByUserId(Integer id);
}
