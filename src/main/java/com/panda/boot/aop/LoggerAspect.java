package com.panda.boot.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(public int com.panda.boot.aop.CalImpl.*(..))")
    public void before(JoinPoint joinpoint){
        String name = joinpoint.getSignature().getName();
        System.out.println(name + "前置调用"+ Arrays.toString(joinpoint.getArgs()));
    }

    @AfterReturning(value = ("execution(public int com.panda.boot.aop.CalImpl.*(..))"),returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "后置调用" + result);
    }

    @Around("execution(public int com.panda.boot.aop.CalImpl.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        try {

            System.out.println(joinPoint.getSignature().getName());
            Object proceed = joinPoint.proceed();
            System.out.println(2);

            return proceed;

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
