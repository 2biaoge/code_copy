package com.qf.service;

public class StudentServiceImpl implements StudentService {
    @Override
    public void xuexi() {
        System.out.println("好好学习,天天想上。");
    }

    @Override
    public String getStudent() {
        System.out.println("wwwwwwwwwww");
        return "三哥";
    }
}
