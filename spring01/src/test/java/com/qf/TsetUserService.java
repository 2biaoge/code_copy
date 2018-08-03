package com.qf;

import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetUserService {
    @Test
    public void tsetAdd(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService =(UserService) context.getBean("userService");
        userService.adduser2();
        context.close();
    }
}
