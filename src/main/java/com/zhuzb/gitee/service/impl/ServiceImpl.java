package com.zhuzb.gitee.service.impl;

import com.zhuzb.gitee.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/9 22:20
 * @Description:
 */

@Slf4j
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

//    private static final Logger log = LoggerFactory.getLogger(ServiceImpl.class);

    @Override
    public void service() {
        log.error("重新测试error日志的记录");
    }
}
