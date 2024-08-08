package com.codedance2023.springbootweb01.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestSimpleParam {

    //原始方式
//    @RequestMapping("/requestSimpleParam")
//    public String requestSimpleParam(HttpServletRequest httpServletRequest) {
//        String name = httpServletRequest.getParameter("name");
//        String age = httpServletRequest.getParameter("age");
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
//        return "OK";
//    }

    //SpringBoot方式
    @RequestMapping("/requestSimpleParam")
    public String requestSimpleParam(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return "ok";

    }

}
