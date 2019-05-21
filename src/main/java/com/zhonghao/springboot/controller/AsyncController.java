package com.zhonghao.springboot.controller;

import com.zhonghao.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    /**
     * 异步处理不阻塞
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        asyncService.batchAdd();
        return "hello";
    }
}
