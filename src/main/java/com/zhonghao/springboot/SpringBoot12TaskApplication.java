package com.zhonghao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
// 开启定时任务
@EnableScheduling
// 开启异步任务
@EnableAsync
@SpringBootApplication
public class SpringBoot12TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot12TaskApplication.class, args);
    }

}
