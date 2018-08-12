package com.qf.dao;

import com.qf.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:appContext2.xml")
public class DAOTset {

    @Autowired
    private UserDao userDao;
    @Test
    public void testUserDao(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        UserInfo user=new UserInfo("huitailang","红太狼");
        userDao.addUser(user);
    }

    @Test
    public void tsetUserDao2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        UserInfo userInfo=new UserInfo("吃饭","xiyifu");
        userDao.addUser(userInfo);
    }

    @Test
    public void del(){
       userDao.del(3L);
    }

    @Test
    public void save(){
        UserInfo userInfo = new UserInfo("两点半", "测试完Druid监控");

        userDao.addUser(userInfo);
    }
    @Test
    public void update(){
        UserInfo userInfo = new UserInfo("两点20", "chidainsha?");
        userInfo.setId(6L);
        userDao.update(userInfo);
    }

    @Test
    public void findById(){
        UserInfo byId = userDao.findById(6L);
        System.out.println(byId.getUserName()+byId.getUserPass()+byId.getId());
    }

    @Test
    public void findAll(){
        List<UserInfo> all = userDao.findAll();
        for (UserInfo userInfo : all) {
            System.out.println(userInfo.getId()+">>>>>>>>>>>>>>>>>>>>>"+userInfo.getUserName()+userInfo.getUserPass());
        }
    }
}
