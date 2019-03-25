package com.wanglh.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hystric  断路器
 * 当feign请求失败的时候  会请求fallback指定的类的方法
 */
@FeignClient(value = "service-hi",fallback = HiServiceHystric.class)
public interface HiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello")
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);

}
