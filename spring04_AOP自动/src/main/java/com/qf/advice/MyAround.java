package com.qf.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("huanraoqian ===前");
        Object proceed = invocation.proceed();
        System.out.println("huizhitongzhi===后");

        return proceed;
    }
}
