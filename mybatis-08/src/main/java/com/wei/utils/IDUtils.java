package com.wei.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author 魏卓其
 * @create 2022-04-08 22:11
 */

public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
