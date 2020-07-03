package com.zhuzb.gitee.controller;

import com.zhuzb.gitee.domain.LogDefine;
import com.zhuzb.gitee.service.LogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/10 0:14
 * @Description: 日志信息控制器
 */
@Api(tags = "日志接口")
@RequestMapping("/log")
@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @ApiOperation("获取所有接口信息")
    @GetMapping("/list")
    public LogDefine logList() {
        LogDefine logDefine = logService.logList();
        return logDefine;
    }
}
