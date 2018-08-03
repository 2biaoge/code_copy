package com.qf.service;

import org.springframework.stereotype.Service;

@Service("carService")
public class CarServiceImpl implements CarService {
    @Override
    public void addCar() {
        System.out.println("买车");
    }

    @Override
    public int getInteger() {
        System.out.println(9999);
        return 5;
    }
}
