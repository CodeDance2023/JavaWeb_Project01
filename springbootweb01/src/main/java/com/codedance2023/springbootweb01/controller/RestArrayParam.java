package com.codedance2023.springbootweb01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class RestArrayParam {
    @RequestMapping("/restArrayParam")
    public String restArrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
}
