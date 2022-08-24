package com.wei.dao;

import com.wei.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-08 17:04
 */
public interface TeacherMapper {
    //获取指定老师，及老师下的所有学生
    public Teacher getTeacher(@Param("tid") int id);
    public Teacher getTeacher2(@Param("tid") int id);

}
