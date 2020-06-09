package com.zhuzb.gitee;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/8 10:37
 * @Description:
 */
public class NormalTest {

    @Test
    public void guava() {
        Cache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .concurrencyLevel(10)
                .recordStats()
                .build();
        cache.put("authCode", "1232");
        String value = cache.getIfPresent("authCode");
        System.out.println(value);
    }
}
