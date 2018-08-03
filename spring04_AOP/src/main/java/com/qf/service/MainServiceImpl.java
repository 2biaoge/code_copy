package com.qf.service;

public class MainServiceImpl implements MainService {
    @Override
    public void show() {
        System.out.println("spring面向切面编程AOP-----------------");
    }

    @Override
    public String getName() {
        System.out.println("Are you Ok ? ");
        return "Mr.Mian";
    }
}
