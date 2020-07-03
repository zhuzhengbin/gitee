package com.zhuzb.gitee.utils;

import java.util.UUID;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/13 7:35
 * @Description: 与字符串相关的工具类
 */
public class StringUtil {

    /**
     * 生成32位的UUID，且所有字母大写
     *
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }
}
