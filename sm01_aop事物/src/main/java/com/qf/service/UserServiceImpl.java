package com.qf.service;

import com.qf.dao.UserDao;
import com.qf.dao.UserDaoImpl;
import com.qf.dto.UserDto;
import com.qf.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.add(user);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findById(Long id) {
        UserDto userDto = new UserDto();
        User user=new User();
        BeanUtils.copyProperties(user,userDto);
        userDto.setUsernamedto(user.getUsername());
        User byId = userDao.findById(id);

        return byId;
    }

    @Override
    public List<User> findAll() {
        List<User> all = userDao.findAll();
        return all;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
