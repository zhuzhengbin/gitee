package com.zhuzb.gitee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/10 6:41
 * @Description:
 * 多线程定时任务要注意的是，同一任务的多个线程也是并发执行的，彼此互不影响
 */
@Configuration
@EnableScheduling
@EnableAsync
public class MultiThreadScheduleTask {

    @Async
    @Scheduled(fixedDelay = 10000)
    public void task1() {
        System.out.println(LocalDateTime.now().toLocalTime() + "定时任务1正在执行:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000 * 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Async
    @Scheduled(fixedRate = 20000)
    public void task2() {
        System.out.println(LocalDateTime.now().toLocalTime() + "定时任务2正在执行:" + Thread.currentThread().getName());
    }
}
