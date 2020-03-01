package com.hxk.mapper;

import com.hxk.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 根据用户id删除用户信息
     * @param id
     */
    void deleteUser(int id);

    /**
     * 根据用户id修改用户信息
     * @param id
     * @return 返回影响行数
     */
    int updateUser(User user);

    /**
     * 根据用户id查询用户所有信息
     * @param id
     * @return 返回一个用户集合
     */
    List<User> selectUser(int id);
}
