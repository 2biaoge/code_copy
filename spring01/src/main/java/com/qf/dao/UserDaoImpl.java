package com.qf.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户。。。。。。。。。1(DAO层)");
    }

    @Override
    public void init() {
        System.out.println("容器初始话...............");
    }

    @Override
    public void destroy() {
        System.out.println("容器销毁....close()?");
    }
}
