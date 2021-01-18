package com.jrf.feign.controller;

import com.jrf.feign.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ruofa
 * @Date 2021/1/18 16:00
 * @Version 1.0
 */

@RestController
@RequestMapping("consumer")
public class DataFeignController {
    @Autowired
    private DataClient dataClient;
    @RequestMapping("feignGet")
    public String get(){
        return dataClient.getData();
    }
}
