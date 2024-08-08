package com.codedance2023.springbootweb01.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//标注为请求处理类
@RestController
public class RestTimeParam {

    //标注为请求处理方法
    @RequestMapping("/restTimeParam")
    public String restTimeParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime localTime) {
        System.out.println(localTime);
        return "ok";
    }
}
