package com.hxk.service;

import com.hxk.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id删除指定用户
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 查询所有用户
     * @return 返回用户集合
     */
    List<User> selectUser();
}
