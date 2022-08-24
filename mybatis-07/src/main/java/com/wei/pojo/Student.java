package com.wei.pojo;

import lombok.Data;

/**
 * @author 魏卓其
 * @create 2022-04-08 16:50
 */
@Data
public class Student {
    private int id;
    private String name;
    //学生需要关联一个老师
    private int tid;
}
