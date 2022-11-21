package com.panda.boot;

import com.panda.boot.service.HelloService1;
import com.panda.hello.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;

@SpringBootApplication
public class BootTest01Application {

    public static void main(String[] args) {

       ConfigurableApplicationContext run = SpringApplication.run(BootTest01Application.class, args);
        // System.out.println(run.getBean(HelloService.class));

         /*HashSet<Integer> integers = new HashSet<>();

        String[] beanNamesForType = run.getBeanNamesForType(HelloService.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
    }

}
