package com.jrf.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ruofa
 * @Date 2021/1/15 18:27
 * @Version 1.0
 */

@RestController
@RequestMapping("provider")
public class Provider_Controller {
    @RequestMapping("get")
    public String getData(){
        return "provide data22222!";
    }
}
