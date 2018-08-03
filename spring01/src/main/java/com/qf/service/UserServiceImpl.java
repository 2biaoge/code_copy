package com.qf.service;

import com.qf.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    @Override
    public void adduser2() {
        System.out.println("................service代码调用dao层addUser...................");
        userDao.addUser();

    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
