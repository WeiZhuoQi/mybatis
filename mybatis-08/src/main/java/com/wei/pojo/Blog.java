package com.wei.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 魏卓其
 * @create 2022-04-08 22:14
 */
@Data
public class Blog {
        private String id;
        private String title;
        private String author;
        private Date createTime;
        private int views;

}
