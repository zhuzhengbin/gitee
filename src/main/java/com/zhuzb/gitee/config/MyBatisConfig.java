package com.zhuzb.gitee.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/9 23:59
 * @Description:
 */
@Configuration
@MapperScan("com.zhuzb.gitee.mapper")
public class MyBatisConfig {
}
