package com.wly.competition_system_management_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public void test() {
        System.out.println("this is a test");
    }
}
