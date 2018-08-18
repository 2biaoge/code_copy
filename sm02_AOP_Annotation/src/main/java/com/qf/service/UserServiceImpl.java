package com.qf.service;

import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    //注入持久层
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User pojo) {

        userMapper.insertSelective(pojo);


    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(User pojo) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public List<User> findByLike(String string) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameLike(string);

        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public List<User> findByPage(Map map) {

        return null;
    }
}