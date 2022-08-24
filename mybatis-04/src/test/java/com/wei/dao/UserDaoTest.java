package com.wei.dao;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wei.pojo.User;
import com.wei.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:53
 */
public class UserDaoTest {
    static Logger logger= Logger.getLogger(UserDaoTest.class);
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
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
    @Test
    public void getUserByLimit(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1, 2);
        //通过java代码层面实现分页
        List<User> userList = sqlSession.selectList("com.wei.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
