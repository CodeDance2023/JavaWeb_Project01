package com.codedance2023.springbootweb01.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPathParam {
    //指定路径参数
    @RequestMapping("/restPathParam/{name}/{age}/{car}")
    //添加注解将路径参数绑定给下面的变量
    public String restPathParam(@PathVariable String name, @PathVariable int age, @PathVariable String car) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("car = " + car);
        return "ok";
    }
}
