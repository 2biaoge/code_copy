package com.qf.tset;

import com.qf.service.MainService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void testService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MainService mianService =(MainService) context.getBean("mainService");
        //mianService.show();
        mianService.getInte();
        context.close();
    }
}
