package com.wei.dao;

import com.wei.pojo.User;
import com.wei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author 魏卓其
 * @create 2022-04-09 14:08
 */
public class MyTest {
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        session.close();
    }
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        HashMap map = new HashMap();
        map.put("name","kuangshen");
        map.put("id",4);
        mapper.updateUser(map);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        session.close();
    }
    @Test
    public void test3(){
        SqlSession session = MybatisUtils.getSqlSession();
        SqlSession session2 = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper2 = session2.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        session.close();
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        session2.close();
    }
}
