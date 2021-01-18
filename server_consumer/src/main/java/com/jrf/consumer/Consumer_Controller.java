package com.jrf.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ruofa
 * @Date 2021/1/18 10:26
 * @Version 1.0
 */

@RestController
@RequestMapping("consumer")
public class Consumer_Controller {

    private final String url="http://localhost:7002/provider/get";

    @RequestMapping("get")

    public String get(){
        RestTemplate template=new RestTemplate();
        String data=template.getForObject(url,String.class);
        return data;
    }
}
