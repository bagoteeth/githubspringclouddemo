package com.jrf.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author ruofa
 * @Date 2021/1/15 18:25
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Application_Provider {
    public static void main(String[] args) {
        SpringApplication.run(Application_Provider.class);
    }
}
