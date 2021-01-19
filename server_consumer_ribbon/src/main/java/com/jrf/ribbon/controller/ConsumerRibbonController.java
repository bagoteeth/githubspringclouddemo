package com.jrf.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ruofa
 * @Date 2021/1/19 11:55
 * @Version 1.0
 */
@RestController
@RequestMapping("consumerRibbon")
public class ConsumerRibbonController {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL="http://TEST-PROVIDER/provide/get";

    @GetMapping("get")
    public String get(){
        String data=restTemplate.getForObject(URL,String.class);
        return data;
    }

}
