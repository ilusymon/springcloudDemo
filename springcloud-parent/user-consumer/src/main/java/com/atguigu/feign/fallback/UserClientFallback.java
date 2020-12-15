package com.atguigu.feign.fallback;

import com.atguigu.domain.User;
import com.atguigu.feign.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Symon
 * @version 1.0
 * @className UserClientFallback
 * @description TODO
 * @date 2020/12/15 10:37
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setName("服务熔断");
        return user;
    }
}
