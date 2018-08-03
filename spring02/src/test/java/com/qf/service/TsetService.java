package com.qf.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetService {
    @Test
    public void testADD(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.AAdd();
        System.out.println(userService.isExecute());
        userService.sendMsg();

    }

    @Test
    public void testJIHE(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.jihe();
    }
}
