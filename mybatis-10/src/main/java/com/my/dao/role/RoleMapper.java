package com.my.dao.role;


import com.my.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
*   getRoleList,获取角色列表
*   add,添加角色信息
*   deleteRoleById,通过Id删除role
*   modify,修改角色信息
*   getRoleById,通过Id获取role
*   roleCodeIsExist,根据roleCode，进行角色编码的唯一性验证
* */

public interface RoleMapper {
    List<Role> getRoleList()throws Exception;
    int add(Role role) throws Exception;
    int deleteRoleById(@Param("id") int delId) throws Exception;
    int modify(Role role) throws Exception;
    Role getRoleById(@Param("id") int id) throws Exception;
    int roleCodeIsExist(@Param("roleCode") String roleCode) throws Exception;
}
