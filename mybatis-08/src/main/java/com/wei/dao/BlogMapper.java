package com.wei.dao;

import com.wei.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author 魏卓其
 * @create 2022-04-08 22:03
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    //查询博客
    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询1-2-3号记录的博客
    List<Blog> queryBlogForeach(Map map);
}
