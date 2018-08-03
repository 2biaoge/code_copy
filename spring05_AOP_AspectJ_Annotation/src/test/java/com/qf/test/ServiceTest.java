package com.qf.test;

import com.qf.service.CarService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void tsetService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarService carService = (CarService)context.getBean("carService");
        carService.addCar();
    }
}
