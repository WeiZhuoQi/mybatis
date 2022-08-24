package com.wei.dao;

import com.wei.pojo.User;
import com.wei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-08 14:45
 */
public class UserMapperTest {
    @Test
    public  void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void getUserById(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        //第二步：执行SQL
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User users = mapper.getUserById(1);
        System.out.println(users);
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(7,"小红","123456"));
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(6,"小强","123456"));
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void testDeleteUser() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(6);

        session.close();
    }
}
