package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Symon
 * @version 1.0
 * @className ConsumerFeignController
 * @description TODO
 * @date 2020/12/15 9:13
 */
@RestController
@RequestMapping("/feign")
public class ConsumerFeignController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userClient.findById(id);
    }
}
