package com.zhuzb.gitee.controller;

import com.zhuzb.gitee.domain.LogDefine;
import com.zhuzb.gitee.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/10 0:14
 * @Description: 日志信息控制器
 */
@RequestMapping("/log")
@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/list")
    public LogDefine logList() {
        LogDefine logDefine = logService.logList();
        return  logDefine;
    }
}
