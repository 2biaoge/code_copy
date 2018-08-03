package com.qf.tset;

import com.qf.service.CarService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetviceTest {
    @Test
    public void testService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        CarService carService =(CarService) context.getBean("carService");
       // carService.addCar();
        carService.show();

    }
}
