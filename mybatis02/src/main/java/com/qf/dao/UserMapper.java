package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //动态添加
    int add1 (User user);

    //分页查询
    List<User> find1(Map map);

    //条件查询
    List<User> find2(User user);

    //集合查询
    List<User> find3(List list);

    //动态更新
    int update1(User user);
}
