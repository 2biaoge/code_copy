package com.qf.service;

import com.qf.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public void addUser(User pojo);

    public void deleteById(Long id);

    public void update(User pojo);

    public User findById(Long id);

    public List<User> findAll();

    public List<User> findByLike(String string);

    public List<User> findByPage(Map map);
}
