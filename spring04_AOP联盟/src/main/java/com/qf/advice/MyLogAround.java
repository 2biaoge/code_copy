package com.qf.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyLogAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("LogAround:---------环绕前：");

        Object proceed = invocation.proceed();//环绕通知必须唤醒目标方法

        System.out.println("LogAround:---------环绕后：");
        return proceed;
    }
}
