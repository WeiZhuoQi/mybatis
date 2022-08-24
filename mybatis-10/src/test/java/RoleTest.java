import com.my.dao.role.RoleMapper;
import com.my.pojo.Role;
import com.my.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class RoleTest {

    @Test
    public void testGetRoleList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.getRoleList();
        for (Role role : roleList) {
            System.out.println(role);
        }
        sqlSession.close();
    }

    @Test
    public void testAdd() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role(0,"SMBMS_MINISTER","部长",1,new Date(),0,null);
        mapper.add(role);
        sqlSession.close();
    }

    @Test
    public void testDeleteRoleById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        mapper.deleteRoleById(4);
        sqlSession.close();
    }

    @Test
    public void testModify() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role(5,null,"副部长",1,null,1,new Date());
        mapper.modify(role);
        sqlSession.close();
    }

    @Test
    public void testGetRoleById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = mapper.getRoleById(5);
        System.out.println(role);
        sqlSession.close();
    }

    @Test
    public void testRoleCodeIsExist() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        int count = mapper.roleCodeIsExist("SMBMS_MINISTER");
        if(count>0){
            System.out.println("roleCode（SMBMS_MINISTER）存在");
        }else{
            System.out.println("roleCode（SMBMS_MINISTER）不存在");
        }
        sqlSession.close();
    }

}
