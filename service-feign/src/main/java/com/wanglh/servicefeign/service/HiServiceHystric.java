package com.wanglh.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry:hi"+name;
    }

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry:hello"+name;
    }
}
