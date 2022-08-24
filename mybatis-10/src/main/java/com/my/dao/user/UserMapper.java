package com.my.dao.user;

import com.my.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * add,增加用户信息
 * getLoginUser,通过userCode获取User
 * getUserList,通过条件查询-userList
 * getUserCount,通过条件查询-用户表记录数
 * deleteUserById,通过userId删除user
 * getUserById,通过userId获取user
 * modify,修改用户信息
 * updatePwd,修改当前用户密码
 */
public interface UserMapper {
    int add(User user)throws Exception;
    User getLoginUser(@Param("userCode") String userCode)throws Exception;
    List<User> getUserList(@Param("userName")String userName,@Param("userRole")int userRole,
                           @Param("from")int currentPageNo,@Param("pageSize")int pageSize)throws Exception;
    int getUserCount(@Param("userName") String userName,@Param("userRole") int userRole)throws Exception;
    int deleteUserById(@Param("delId") int delId)throws Exception;
    User getUserById(@Param("id")int id)throws Exception;
    int modify(User user)throws Exception;
    int updatePwd( @Param("id")int id,@Param("pwd") String pwd)throws Exception;
}

