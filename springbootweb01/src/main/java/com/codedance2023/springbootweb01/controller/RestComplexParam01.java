package com.codedance2023.springbootweb01.controller;

import com.codedance2023.springbootweb01.pojo.User01;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class RestComplexParam01 {
    @RequestMapping("/restComplexParam")
    public String restComplexParam(User01 user) {
        System.out.println(user);
        return "ok";
    }
}
