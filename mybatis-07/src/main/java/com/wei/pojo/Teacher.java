package com.wei.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-04-08 16:54
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师拥有多个学生
    private List<Student> students;
}
