package com.zhuzb.gitee.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/13 7:38
 * @Description: 与日期相关的工具类
 */
public class DateUtil {
    private static final String FORMAT_A = "yyyy-MM-dd HH:mm:ss";
    private static final String FORMAT_B = "yyyyMMddHHmmss";
    private static final String FORMAT_DATE = "yyyy-MM-dd";
    private static final String FORMAT_TIME = "HH:mm:ss";


    /**
     * 根据日期，生成指定格式的时间字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 不指定格式，默认生成A格式的时间字符串
     *
     * @param date
     * @return
     */
    public static String dateString(Date date) {
        return dateString(date, FORMAT_A);
    }

    /**
     * 获取指定格式的当天时间字符串
     *
     * @param format
     * @return
     */
    public static String stringDatetimeOfToday(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    /**
     * 默认格式的当天时间字符串
     *
     * @return
     */
    public static String stringDatetimeOfToday() {
        return stringDatetimeOfToday(FORMAT_A);
    }
}
