package com.qf.tset;

import com.qf.service.MainService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

public class ServiceTest {
    @Test
    public void tsetService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MainService proxy = (MainService)context.getBean("proxy");
        //proxy.show();
        proxy.getName();
    }
}
