package com.zhonghao.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    private static int count = 1;

    /**
     * 每隔1秒执行
     */
    @Scheduled(cron = "*/1 * * * * MON-FRI")
    public void dataCount() {
        System.out.println("程序运行第" + count++ + "秒");
    }
}
