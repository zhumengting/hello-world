package com.zmt.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World !!!";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "Hello mt !!!";
    }

    @RequestMapping("/hello3")
    @ResponseBody
    public String hello3() {
        return "test 111222333 !!!";
    }

}