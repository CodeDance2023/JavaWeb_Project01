package com.codedance2023.springbootweb01.controller;

import com.codedance2023.springbootweb01.pojo.User02;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestNestedComplexParam {
    @RequestMapping("/restNestedComplexParam")
    public String restNestedComplexParam(User02 user02) {
        System.out.println(user02);
        return "OK";

    }
}
