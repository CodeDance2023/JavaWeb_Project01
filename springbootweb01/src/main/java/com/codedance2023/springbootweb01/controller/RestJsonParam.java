package com.codedance2023.springbootweb01.controller;

import com.codedance2023.springbootweb01.pojo.JsonUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//标注为请求处理类
@RestController
public class RestJsonParam {
    //标注为请求处理方法
    @RequestMapping("/restJsonParam")
    //将JSON数据封装到对象中
    public String restJsonParam(@RequestBody JsonUser jsonUser) {
        System.out.println(jsonUser);
        return "ok";
    }
}
