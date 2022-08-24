package com.wei.dao;

import com.wei.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:33
 */
public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);
    //查询全部用户
    List<User> selectUser();
    //根据id查询全部用户
    User getUserById(int id);
    User getUserById2(Map<String,Object> map);
    //insert一个用户
    int addUser(User user);
    //万能Map,不需要知道数据库中的所有属性，只需要查对应的字段
    int addUser2(Map<String,Object> map);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
