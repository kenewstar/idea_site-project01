package com.hxk.test;

import com.hxk.mapper.UserMapper;
import com.hxk.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUsername("黄新柯");
        user.setPassword("123456");
        this.userMapper.insertUser(user);

    }
}
