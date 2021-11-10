package com.najim.rabbit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 */
@RestController("/test")
public class TestController {

    /** 测试接口是否已经开通 */
    @GetMapping("/hello")
    public String hello() {
        return "Hello Rabbit !";
    }
}
