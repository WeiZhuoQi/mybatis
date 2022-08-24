package com.my.dao.provider;

import com.my.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * add,增加供应商
 * getProviderList,通过供应商名称、编码获取供应商列表-模糊查询-providerList
 * getProList,获取供应商列表
 * getProviderCount,通过条件查询-供应商表记录数
 * deleteProviderById,通过proId删除Provider
 * getProviderById,通过proId获取Provider
 * modify,修改供应商信息
 *
 */
public interface ProviderMapper {
    int add(Provider provider)throws Exception;
    List<Provider> getProviderList(@Param("proName") String proName, @Param("proCode") String proCode)throws Exception;
    List<Provider> getProList() throws Exception;
    int getProviderCount(@Param("proName") String proName,@Param("proCode") String proCode) throws Exception;
    int deleteProviderById(@Param("id") int id)throws Exception;
    Provider getProviderById(@Param("id") int id)throws Exception;
    int modify(Provider provider)throws Exception;
}
