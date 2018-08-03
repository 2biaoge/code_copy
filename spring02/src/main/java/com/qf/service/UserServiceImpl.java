package com.qf.service;

import com.qf.dao.UserDaoImpl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImpl implements UserService {
    //依赖持久层的功能
    private UserDaoImpl userDao;
    //启动线程的标识
    private boolean execute;//基本类型


    private String tag;//构造函数参数

    //数组
    private String[] strings;

    //集合
    private List<String> list;


    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
//构造函数赋值

    public UserServiceImpl() {
    }

    public UserServiceImpl(String tag) {
        this.tag = tag;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {

        this.execute = execute;
    }

    //计划用set注入
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    @Override
    public void AAdd() {
        userDao.add();
    }

    @Override
    public void sendMsg() {
        System.out.println("send............。。。。。。。。。。。。。");
        if (isExecute()) {
            userDao.add();
        } else {
            System.out.println("不做添加。。。。");
        }

        if (tag.equals("admin")) {
            System.out.println("管理员");
        } else if (tag.equals("user")) {
            System.out.println("普通用户");
        } else {
            System.out.println("其他");
        }
    }
    @Override
    public void jihe() {
        //集合
        for (String s : getStrings()) {
            System.out.print(s);
        }

        //List
        for (String s : list) {
            System.out.println(s);
        }
        //Set
        for (String s : stringSet) {
            System.out.println(s);
        }
        //Map
        for (String s : map.keySet()) {
            System.out.println("KEY"+s+"VALUE"+map.get(s));
        }

        for (String s : properties.stringPropertyNames()) {
            System.out.println(s+","+properties.getProperty(s));
        }
    }



    private Set<String> stringSet;

    private Map<String,Integer> map;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }
}
