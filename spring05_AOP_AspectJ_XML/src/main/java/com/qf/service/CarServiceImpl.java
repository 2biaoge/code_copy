package com.qf.service;

public class CarServiceImpl implements CarService {
    @Override
    public void addCar() {
        System.out.println("添加一个Car");
    }

    @Override
    public String show() {
        System.out.println("买车");
        return "这个车showfangfa";
    }
}
