package com.najim.rabbit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NaJim
 * date 2021-10-29
 */
@RestController
public class UserInfoController {

    /** 测试接口是否已经开通 */
    @GetMapping("/hello")
    public String hello() {
        return "Hello Rabbit !";
    }
}
