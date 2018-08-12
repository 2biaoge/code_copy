package com.qf.dao;

import com.qf.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMappereTset {
    @Test
    public void testdelById(){
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.deleteByPrimaryKey(8L);
        System.out.println(i);
    }
    @Test
    public void testadd(){
        UserMapperDao userMapperDao=new UserMapperDao();
        User user=new User();
        user.setUsername("姚杰男");
        user.setPassword("13454512");
        userMapperDao.insert(user);
    }

    @Test
    public void testadd2(){
        UserMapperDao userMapperDao=new UserMapperDao();
        User user=new User();
            user.setUsername("齐海涛");
        user.setPassword("1qqqqqqqqqqqqqq");
        int insert = userMapperDao.insert(user);
        System.out.println(insert);
    }

    @Test
    public void selectById(){
        UserMapperDao userMapperDao =new UserMapperDao();
        User user = userMapperDao.selectByPrimaryKey(15L);
        System.out.println(user.toString());
    }


    @Test
    public void update1(){
        User user=new User();
        user.setUsername("修改2");
       // user.setPassword("111111111111111");
        user.setId(17L);
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.updateByPrimaryKeySelective(user);
        System.out.println(i);
    }

    @Test
    public void update2(){
        User user=new User();
        user.setUsername("修改2");
        user.setPassword("2222222222222");
        user.setId(19L);
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.updateByPrimaryKey(user);
        System.out.println(i);
    }
    @Test
    public void tsetadd1(){
        User user = new User();
        user.setUsername("好妹妹");
        user.setPassword("我说今晚月色那么美你说是的");
        UserMapper userMapper =new UserMapperDao();
        int i = userMapper.add1(user);
        System.out.println(i);
    }

    @Test
    public void tsetFind1(){
        Map<String,Integer> map = new HashMap();
        map.put("startIndex",6);
        map.put("pagesize",3);
        UserMapper userMapper=new UserMapperDao();
        List<User> users = userMapper.find1(map);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void tsetFind2(){
        User user=new User();
        user.setUsername("修改2");
      //  user.setPassword("2222222222222");
        UserMapper userMapperDao=new UserMapperDao();
        List<User> users = userMapperDao.find2(user);
        for (User user1 : users) {
            System.out.println(user1.toString());
        }
    }
    @Test
    public void testFind3(){
        List<Long>  list = new ArrayList<>();
        list.add(12L);
        list.add(13L);
        list.add(15L);
        UserMapper userMapper=new UserMapperDao();
        List<User> users = userMapper.find3(list);
        System.out.println(users.toArray());
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void taetUpdate1(){
        User user=new User();
        user.setId(11L);
        user.setUsername("时间");
        user.setUsername("11点41分");
        UserMapperDao userMapperDao = new UserMapperDao();
        int i = userMapperDao.update1(user);
        System.out.println(i);
    }



}
