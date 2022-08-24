package com.wei.dao;

import com.wei.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:33
 */
public interface UserMapper {
    //查询全部用户
    List<User> selectUser();
    //根据id查询全部用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
