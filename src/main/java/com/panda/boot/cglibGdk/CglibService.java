package com.panda.boot.cglibGdk;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class CglibService {

    public Integer testCglib(Integer a, Integer b ){

        final UserService target = new UserService();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置代理");
                Object invoke = method.invoke(target, objects);
                System.out.println("后置代理");
                return invoke;
            }
        });

        UserService userService = (UserService) enhancer.create();
        Integer result = userService.testCglib(a, b);

        return result;
    }
}
