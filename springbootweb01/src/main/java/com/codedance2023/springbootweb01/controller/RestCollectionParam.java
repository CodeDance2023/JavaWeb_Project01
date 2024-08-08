package com.codedance2023.springbootweb01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//标注为请求处理类
@RestController
public class RestCollectionParam {
    @RequestMapping("/restCollectionParam")
    public String restCollectionParam(@RequestParam ArrayList<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }
}
