package com.hxk.service.impl;

import com.hxk.mapper.UserMapper;
import com.hxk.pojo.User;
import com.hxk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        this.userMapper.deleteUser(id);
    }

    @Override
    public List<User> selectUser() {
        List<User> users = this.userMapper.selectUser();
        return users;
    }
}
