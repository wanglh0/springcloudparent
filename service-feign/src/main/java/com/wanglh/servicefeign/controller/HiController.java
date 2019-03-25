package com.wanglh.servicefeign.controller;

import com.wanglh.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        return    hiService.sayHiFromClientOne(name);
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return    hiService.sayHelloFromClientOne(name);
    }
}
