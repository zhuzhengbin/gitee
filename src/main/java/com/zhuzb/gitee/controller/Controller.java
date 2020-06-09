package com.zhuzb.gitee.controller;

import com.zhuzb.gitee.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/7 16:53
 * @Description:
 */
@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome.";
    }

    @GetMapping("/service")
    public void service() {
        service.service();
    }
}
