package com.zhuzb.gitee.service.impl;

import com.zhuzb.gitee.domain.LogDefine;
import com.zhuzb.gitee.mapper.LogMapper;
import com.zhuzb.gitee.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/10 0:13
 * @Description:
 */
@Service
@Slf4j
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public LogDefine logList() {
        List<LogDefine> logDefineList = logMapper.logList();
        if (logDefineList.size() > 0) {
            return logDefineList.get(0);
        } else {
            log.error("查询结果出错");
            return null;
        }
    }
}
