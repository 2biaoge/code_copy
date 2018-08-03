package com.qf.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知。。。");
    }
    public void myAfter( JoinPoint joinPoint ,Object res){
        System.out.println("后置通知。。。");
    }
    public void myAround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕前：------");

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("环绕后：------");
    }
}
