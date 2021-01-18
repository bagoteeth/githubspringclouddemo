package com.jrf.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author ruofa
 * @Date 2021/1/18 13:29
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Application_Zuul {
    public static void main(String[] args) {
        SpringApplication.run(Application_Zuul.class);
    }
}