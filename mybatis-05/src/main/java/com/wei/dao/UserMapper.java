package com.wei.dao;

import com.wei.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:33
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id=#{id}")
    //方法存在多个基本类型参数时,所有参数前面要加上@Param，且要保证Param括号中的名字要正确
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);
    //根据id删除用
    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id")int id);
}
