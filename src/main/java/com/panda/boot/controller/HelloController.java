package com.panda.boot.controller;

import com.panda.boot.service.HelloService1;
import com.panda.boot.service.HelloService2;
import com.panda.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloService1 helloService;

    @Autowired
    HelloService2 helloService3;


    @GetMapping("/hello")
    public String sayHello() {
        return helloService.sayHello("888");
    }
}
