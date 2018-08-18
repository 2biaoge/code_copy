package com.qf.tset;

import com.qf.dto.UserDto;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void tsetInsert(){
        User user = new User();
        user.setUsername("SM整合33");
        user.setPassword("DTO是干什么用的333");
        userService.insert(user);
    }
    @Test
    public void tsetUpdate(){
        User user = new User();
        user.setUsername("SM整合");
        user.setPassword("测试修改");
        user.setId(20L);
        userService.update(user);
    }

    @Test
    public void testDelete(){

        userService.deleteById(22L);
    }

    @Test
    public void testFindById(){
        User byId = userService.findById(15L);
        System.out.println(byId.getPassword()+byId.getUsername());
    }
}
