package com.zhonghao.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    /**
     * 异步处理的方法
     */
    @Async
    public void batchAdd() {
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("批量保存数据中....");
    }
}
