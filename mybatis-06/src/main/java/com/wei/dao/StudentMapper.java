package com.wei.dao;

import com.wei.pojo.Student;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-08 17:04
 */
public interface StudentMapper {
    //查询所有学生信息，以及对应的老师的信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
