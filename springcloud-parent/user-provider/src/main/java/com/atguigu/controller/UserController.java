package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Symon
 * @version 1.0
 * @className UserController
 * @description TODO
 * @date 2020/12/14 14:24
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/find/{id}")
    public User findById(@PathVariable(value = "id") Integer id){
        if (id==3){
            throw new RuntimeException("aaa");
        }
        User user = userService.findByUserId(id);
        user.setUsername(user+"     user-provider");
        return user;
    }
}