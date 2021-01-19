package com.jrf.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ruofa
 * @Date 2021/1/18 15:31
 * @Version 1.0
 */
@FeignClient(value = "TEST-PROVIDER")
@RequestMapping("provider")
public interface DataClient {
    //和调用服务controller的一致
    @RequestMapping("get")
    String getData();
}
