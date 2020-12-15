package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Symon
 * @version 1.0
 * @className UserConsumerApplication
 * @description TODO
 * @date 2020/12/14 14:47
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启Eureka客户端发现功能
@EnableCircuitBreaker // 开启熔断
@EnableFeignClients(basePackages = {"com.atguigu.feign"})
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class,args);
    }

    /***
     * 将RestTemplate的实例放到Spring容器中
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}