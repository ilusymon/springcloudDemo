package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Symon
 * @version 1.0
 * @className EurekaServerApplication
 * @description TODO
 * @date 2020/12/14 14:16
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
