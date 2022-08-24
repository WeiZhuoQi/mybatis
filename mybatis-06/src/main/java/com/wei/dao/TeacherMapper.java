package com.wei.dao;

import com.wei.pojo.Teacher;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 魏卓其
 * @create 2022-04-08 17:04
 */
public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid")int id);
}
