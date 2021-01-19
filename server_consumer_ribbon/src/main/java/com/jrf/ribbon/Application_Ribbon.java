package com.jrf.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ruofa
 * @Date 2021/1/19 11:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Application_Ribbon {
    public static void main(String[] args) {
        SpringApplication.run(Application_Ribbon.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
