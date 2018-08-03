package com.qf.service;

import com.qf.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("userService")
public class UseServiceImpl implements UseService {



    @Autowired
    @Qualifier("userDao")
    private UserDAO userDao;

    private boolean yon;

    private String str;

    private int[] arr;

    private List<String> list;

    private Set<Integer> integerSet;

    private Map<String,Integer> map;

    private Properties properties;


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UseServiceImpl() {
    }

    public UseServiceImpl(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getIntegerSet() {
        return integerSet;
    }

    public void setIntegerSet(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public boolean isYon() {
        return yon;
    }

    public void setYon(boolean yon) {
        this.yon = yon;
    }

    public UserDAO getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public void find() {
        System.out.println("service.....find()");
        userDao.select();
        if(str.equals("admin")){
            System.out.println("系统管理员");
        }else if(str.equals("user")){
            System.out.println("普通用户");
        }else {
            System.out.println("其他");
        }
        if (isYon()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (String s : list) {
            System.out.println(s);
        }
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
        for (String s : map.keySet()) {
            System.out.println(s+"============"+map.get(s));
        }
        for (String s : properties.stringPropertyNames()) {
            System.out.println(s+","+properties.getProperty(s));
        }
/*        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            double random = Math.random();
            System.out.println(String.format(iterator.next() + ".............." + Math.random()));
        }*/
    }
}
