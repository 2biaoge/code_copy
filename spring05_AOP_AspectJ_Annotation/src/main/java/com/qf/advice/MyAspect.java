package com.qf.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.qf.service.*.*(..))")
    public void myPoint(){}

    @Before("myPoint()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知。。");
    }

    @AfterReturning(value ="myPoint()",returning = "res")
    public void myAfter(JoinPoint joinPoint ,Object res){
        System.out.println("houzhi通知"+res);
    }

    @Around("myPoint()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕前：--------");
        Object proceed=null;
        try {
           proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后：--------");
        return proceed;
    }

}
