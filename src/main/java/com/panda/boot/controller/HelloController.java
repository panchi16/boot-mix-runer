package com.panda.boot.controller;

//import com.panda.boot.service.HelloService;
import com.panda.boot.service.HelloService1;
import com.panda.boot.service.HelloService2;
import com.panda.hello.bean.HelloProperties;
import com.panda.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

   /* @Resource
    HelloService1 helloService;*/

    @Resource
    HelloService2 helloService3;

    @Autowired
    HelloService helloService;

    @Autowired
    HelloProperties helloProperties;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ConfigurableApplicationContext configurableApplicationContext;

    @GetMapping("/hello")
    public String sayHello() {

        Environment environment = applicationContext.getEnvironment();
        ConfigurableEnvironment environment1 = configurableApplicationContext.getEnvironment();
        String abc = environment.getProperty("abc");
        System.out.println(abc);

        System.out.println(helloProperties.getBefore());
        return helloService.sayHello("888");
    }
}
