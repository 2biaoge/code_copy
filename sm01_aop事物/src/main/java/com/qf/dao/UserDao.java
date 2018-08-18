package com.qf.dao;

import com.qf.dto.UserDto;
import com.qf.pojo.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void deleteById(Long id);
    void update(User user);
    User findById(Long id);
    List<User> findAll();

}
