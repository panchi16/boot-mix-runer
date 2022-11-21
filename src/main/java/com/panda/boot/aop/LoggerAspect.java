package com.panda.boot.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("execution(public int com.panda.boot.aop.CalImpl.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint joinpoint){
        String name = joinpoint.getSignature().getName();
        System.out.println(name + "前置调用"+ Arrays.toString(joinpoint.getArgs()));
    }

    @AfterReturning(value = ("execution(public int com.panda.boot.aop.CalImpl.*(..))"),returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "后置调用" + result);
    }

    @Around("com.panda.boot.aop.LoggerAspect.pointCut()")
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
