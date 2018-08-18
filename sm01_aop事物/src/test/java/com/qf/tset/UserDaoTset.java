package com.qf.tset;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTset {

    @Autowired
    private UserDao userDao;
    @Test
    public void tsetFindById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) context.getBean("userDao");
        User byId = userDao.findById(12L);
        System.out.println(byId.getId()+"\t"+byId.getUsername()+"\t"+byId.getPassword());
    }

    @Test
    public void testAdd(){
        User user = new User();
        user.setUsername("kkkk");
        user.setPassword("KKKKKK");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) context.getBean("userDao");
        userDao.add(user);
    }

    @Test
    public void findAll(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao=(UserDao) context.getBean("userDao");

        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user.getUsername()+"\t"+user.getPassword());
        }
    }


}

