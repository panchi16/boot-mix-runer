package com.panda.boot.config;

import com.panda.boot.service.HelloService1;
import com.panda.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfig {

    /*@Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        return helloService;
    }*/

    @Bean
    public HelloService1 helloService1() {
        return new HelloService1();
    }
}
