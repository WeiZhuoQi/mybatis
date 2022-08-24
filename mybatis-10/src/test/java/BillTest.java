import com.my.dao.bill.BillMapper;
import com.my.pojo.Bill;
import com.my.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class BillTest {

    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill(1,"BILL2016_019","跑步鞋","运动鞋","双",BigDecimal.valueOf(100),BigDecimal.valueOf(100000),1,17,1,new Date(),0,null);
        mapper.add(bill);
        sqlSession.close();
    }

    @Test
    public void testGetBillList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill(0,"_00",null,null,null,BigDecimal.valueOf(0),BigDecimal.valueOf(0),2,6,0,null,0,null);
        List<Bill> billList = mapper.getBillList(bill);
        for (Bill bill2 : billList) {
            System.out.println(bill2);
        }
        sqlSession.close();
    }

    @Test
    public void testDeleteBillById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        mapper.deleteBillById(19);
        sqlSession.close();
    }

    @Test
    public void testGetBillById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = mapper.getBillById(20);
        System.out.println(bill);
        sqlSession.close();
    }

    @Test
    public void testModify(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill(20,"BILL2016_020",null,null,null,BigDecimal.valueOf(100),BigDecimal.valueOf(100000),2,0,0,null,1,new Date());
        mapper.modify(bill);
        sqlSession.close();
    }

    @Test
    public void testGetBillCountByProviderId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        BigDecimal count = mapper.getBillCountByProviderId(2);
        System.out.println("共有" + count + "个");
        sqlSession.close();
    }

    @Test
    public void testGetBillCount(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int count = mapper.getBillCount("跑步鞋", 17, 2);
        System.out.println("共有" + count + "个");
        sqlSession.close();
    }

    @Test
    public void testDeleteBillByProviderId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        mapper.deleteBillByProviderId(17);
        sqlSession.close();
    }



}
