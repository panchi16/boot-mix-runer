package com.panda.boot.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
//@Scope(SCOPE_PROTOTYPE)
public class HelloService2 {

    public HelloService2(){
        System.out.println(8888);
    }
    public String sayHello(String name) {
        return "77777";
    }
}
