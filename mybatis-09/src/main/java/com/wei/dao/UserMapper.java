package com.wei.dao;

import com.wei.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 魏卓其
 * @create 2022-04-09 11:29
 */
public interface UserMapper  {
    //根据id查询用户
    User queryUserById(@Param("id") int id);
    //修改用户
    int updateUser(Map map);
}
