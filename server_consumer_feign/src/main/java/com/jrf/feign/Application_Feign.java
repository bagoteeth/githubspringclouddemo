package com.jrf.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author ruofa
 * @Date 2021/1/18 15:18
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.jrf.feign.client")
public class Application_Feign {
    public static void main(String[] args) {
        SpringApplication.run(Application_Feign.class);
    }
}
