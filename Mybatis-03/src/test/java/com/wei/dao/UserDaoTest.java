package com.wei.dao;

import com.wei.pojo.User;
import com.wei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:53
 */
public class UserDaoTest {
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



}
