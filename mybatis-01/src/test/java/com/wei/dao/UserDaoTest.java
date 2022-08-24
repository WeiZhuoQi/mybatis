package com.wei.dao;

import com.wei.pojo.User;
import com.wei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-05 16:53
 */
public class UserDaoTest {
    @Test
    public void test1(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        //第二步：执行SQL
        UserMapper userDao=sqlSession.getMapper(UserMapper.class);
        List<User> users = userDao.selectUser();
        for(User user:users){
            System.out.println(user);
        }
        //关闭SqlSession
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
    //增删改需要提交事务
    @Test
    public void addUser(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res=mapper.addUser(new User(8,"李六","123333"));
        if(res>0){
            System.out.println("插入成功");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int 威威 = mapper.updateUser(new User(4, "威威", "123"));
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(6);
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("userid",6);
        map.put("username","喵喵");
        map.put("password",1234);
        mapper.addUser2(map);
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void getUserById2(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("userid",6);
        User userById2 = mapper.getUserById2(map);
        System.out.println(userById2);
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void getUserLike(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        //第二步：执行SQL
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userlist = mapper.getUserLike("李%");
        for(User user:userlist){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }
}
