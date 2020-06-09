package com.zhuzb.gitee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/10 6:32
 * @Description: 静态定时任务（单线程执行，会受到同线程中其他定时任务的影响）
 */
//@Configuration
//@EnableScheduling
public class StaticScheduleTask {

    //    @Scheduled(fixedRate = 5000)  // 固定每5000ms执行一次
//    @Scheduled(cron = "0/5 * * * * ?")
    public void echo() {
        System.out.println("定时任务2执行中...");
    }
}
