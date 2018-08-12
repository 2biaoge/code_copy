package com.qf.dao;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface UserDao {

    public void addUser(UserInfo pojo);

    public void del(Long id);

    public void update(UserInfo pojo);

    public UserInfo findById(Long id);

    public List<UserInfo> findAll();

}
