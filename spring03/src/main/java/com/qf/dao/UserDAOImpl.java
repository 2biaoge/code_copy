package com.qf.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAOImpl implements UserDAO {
    @Override
    public void select() {
        System.out.println("DAO...查询。select()");
    }
}
