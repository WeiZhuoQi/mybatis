import com.my.dao.user.UserMapper;
import com.my.pojo.User;
import com.my.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UserTest {

    @Test
    public void testAdd() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(16,"sunjia","孙嘉","123456",1,new Date(1990,5,26),"188888888","浙江",2,1,new Date(),0,null);
        mapper.add(user);
        sqlSession.close();
    }

    @Test
    public void testGetLoginUser() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getLoginUser("admin");
        if(user!=null){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList(null,3,0,2);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserCount() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count = mapper.getUserCount("孙嘉",2);
        System.out.println("共有" + count + "个");
        sqlSession.close();
    }

    @Test
    public void testDeleteUserById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(16);
        sqlSession.close();
    }

    @Test
    public void testGetUserById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testModify() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(16,"sunjia","孙嘉","12345678",1,getTime(1995,6,23),"188888888","浙江嘉兴市",2,1,new Date(),1,new Date());
        mapper.modify(user);
        sqlSession.close();
    }

    @Test
    public void testUpdatePwd() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updatePwd(16,"123456");
        sqlSession.close();
    }

    public Date getTime(int year,int month,int date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(year, month, date);
        return calendar.getTime();
    }

}
