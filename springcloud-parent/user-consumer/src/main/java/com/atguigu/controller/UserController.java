package com.atguigu.controller;

import com.atguigu.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className UserController
 * @description TODO
 * @date 2020/12/14 14:47
 */
@RestController
@RequestMapping(value = "/consumer")
@DefaultProperties(defaultFallback = "defaultFailBack")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    public User defaultFailBack(){
        User user = new User();
        user.setUsername("Default-服务降级,默认处理！");
        return  user;
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    /****
     * 在user-consumer服务中通过RestTemplate调用user-provider服务
     * @param id
     * @return
     */
    @HystrixCommand
    @GetMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        String url = "http://user-provider/user/find/"+id;
        return restTemplate.getForObject(url,User.class);
    }

}
