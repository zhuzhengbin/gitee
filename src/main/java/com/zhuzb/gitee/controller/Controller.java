package com.zhuzb.gitee.controller;

import com.zhuzb.gitee.service.Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/7 16:53
 * @Description:
 */
@Api(tags = "首页控制器")
@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private Service service;

    @ApiOperation("欢迎处理接口")
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome.";
    }

    @ApiOperation("服务接口")
    @GetMapping("/service")
    public void service() {
        service.service();
    }
}
