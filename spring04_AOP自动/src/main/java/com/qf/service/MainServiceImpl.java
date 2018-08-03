package com.qf.service;

public class MainServiceImpl implements MainService {
    @Override
    public void show() {
        System.out.println("无返回值方法");
    }

    @Override
    public int getInte() {
        System.out.println("返回值整型");
        return 65531;
    }
}
