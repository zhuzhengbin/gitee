package com.zhuzb.gitee;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/8 10:37
 * @Description: 普通测试，不引入Spring
 */
public class NormalTest {

    @BeforeEach
    public void beforeExe() {
        System.out.println("-------------------------  测试开始  -------------------------");
        System.out.println();
    }

    @Test
    public void guava() {
        Cache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(2) // 当加入到缓存中的键值对多于最大值时，会覆盖最先放入的键值对
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .concurrencyLevel(10)
                .recordStats()
                .build();
        cache.put("authCode", "1232");
        cache.put("name", "zhangsan");
        cache.put("age", "18"); // 覆盖了第一个加入的键值对，即“authCode”:"1232"
        String value = cache.getIfPresent("authCode");
        System.out.println(value);// 输出为null
        System.out.println(cache.getIfPresent("age")); // 会输出“18”
    }

    @Test
    public void date() {
        // 当前日期的毫秒数
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @AfterEach
    public void afterExe() {
        System.out.println();
        System.out.println("-------------------------  测试结束  -------------------------");
    }
}
