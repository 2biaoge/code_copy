package com.qf.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetService {
    @Test
    public void testFind(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UseService userService = (UseServiceImpl)context.getBean("userService");
        userService.find();
    }

}
