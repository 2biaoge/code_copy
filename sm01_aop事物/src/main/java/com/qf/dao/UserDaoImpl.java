package com.qf.dao;

import com.qf.dto.UserDto;
import com.qf.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public void add(User user) {

        getSqlSession().insert("com.qf.mapper.UserMapper.insertSelective",user);
    }

    @Override
    public void deleteById(Long id) {

        this.getSqlSession().delete("com.qf.mapper.UserMapper.deleteByPrimaryKey",id);
    }

    @Override
    public void update(User user) {
        getSqlSession().update("com.qf.mapper.UserMapper.updateByPrimaryKeySelective",user);

    }

    @Override
    public User findById(Long id) {
        User user = getSqlSession().selectOne("com.qf.mapper.UserMapper.selectByPrimaryKey", id);

        return user;
    }

    @Override
    public List<User> findAll() {

        List<User> userList= getSqlSession().selectList("com.qf.mapper.UserMapper.selectAll");
        return userList;
    }
}
