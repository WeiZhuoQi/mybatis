package com.wei.dao;

import com.wei.pojo.User;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:33
 */
public interface UserMapper {
    //根据id查询全部用户
    User getUserById(int id);

}
