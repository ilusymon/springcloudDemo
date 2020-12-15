package com.atguigu.feign;

import com.atguigu.domain.User;
import com.atguigu.feign.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Symon
 * @version 1.0
 * @className UserClient
 * @description TODO
 * @date 2020/12/15 9:08
 */
@FeignClient(value = "user-provider", fallback = UserClientFallback.class)
public interface UserClient {
    @RequestMapping(value = "/user/find/{id}")
    public User findById(@PathVariable(value = "id") Integer id);
}
