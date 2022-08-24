import com.my.dao.provider.ProviderMapper;
import com.my.pojo.Provider;
import com.my.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class ProviderTest {

    @Test
    public void testAdd() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider(1,"ZJ_GYS003","浙江喜来登有限公司","长期合作伙伴，主营产品：运动服饰、运动器械",
                "林浩","13212361568","浙江省嘉兴市桐乡市巧燕路","0579-34462532",1,new Date(),0,null);
        mapper.add(provider);
        sqlSession.close();
    }

    @Test
    public void testGetProviderList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        List<Provider> providerList = mapper.getProviderList("北京", "001");
        for (Provider provider : providerList) {
            System.out.println(provider);
        }
        sqlSession.close();
    }

    @Test
    public void testDeleteProviderById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        mapper.deleteProviderById(16);
        sqlSession.close();
    }

    @Test
    public void testGetProviderById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = mapper.getProviderById(17);
        System.out.println(provider);
        sqlSession.close();
    }

    @Test
    public void testModify() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider(17,"ZJ_GYS006",null,null,
                null,"13212361562","浙江省嘉兴市桐乡市巧燕路2号","0579-36662532",0,null,1,new Date());
        mapper.modify(provider);
        sqlSession.close();
    }

    @Test
    public void testGetProList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        List<Provider> proList = mapper.getProList();
        for (Provider provider : proList) {
            System.out.println(provider);
        }
        sqlSession.close();
    }

    @Test
    public void testGetProviderCount() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        int count = mapper.getProviderCount("北京三木堂商贸有限公司", "BJ_GYS001");
        System.out.println("共有" + count + "个");
        sqlSession.close();
    }

}
