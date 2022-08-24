package com.my.dao.bill;

import com.my.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * add，增加了订单
 * getBillList，通过查询条件获取供应商列表-模糊查询
 * delId删除Bill
 * modify，修改订单信息
 * getBillCountByProviderId，根据供应商ID查询订单数量
 * getBillCount,通过条件查询-订单表记录数
 * deleteBillByProviderId,根据供应商Id删除订单信息
 */
public interface BillMapper {
    int add(Bill bill);
    List<Bill> getBillList(Bill bill);
    int deleteBillById(int id);
    Bill getBillById(@Param("id") int id);
    int modify(Bill bill);
    BigDecimal getBillCountByProviderId(@Param("providerId")int providerId);
    int getBillCount(@Param("productName") String productName,@Param("providerId") int providerId,@Param("isPayment") int isPayment);
    int deleteBillByProviderId(@Param("providerId") int providerId);
}
