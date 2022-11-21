package com.panda.boot.cglibGdk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Service
public class GdkService {

    public Integer testGdkProxy(Integer a, Integer b){
        CompanyService companyService1 = new CompanyServiceImpl();

        Invocation1 invocation1 = new Invocation1(companyService1);

        CompanyService proxy = (CompanyService) Proxy.newProxyInstance(companyService1.getClass().getClassLoader(), companyService1.getClass().getInterfaces(), invocation1);

        return proxy.math(a,b);
    }

    public Integer testGdkProxy2(Integer a, Integer b){

        CompanyService proxy = (CompanyService) Proxy.newProxyInstance(CompanyService.class.getClassLoader(),new Class [] {CompanyService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("1111");
                System.out.println("22222");
                return 8;
            }
        });

        return proxy.math(a,b);
    }
}

class Invocation1 implements InvocationHandler{
    private Object target;

    Invocation1(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("gdk前置代理逻辑");
        Object invoke = method.invoke(target, args);
        System.out.println(invoke);
        System.out.println("gdk后置代理逻辑");
        return invoke;
    }
}