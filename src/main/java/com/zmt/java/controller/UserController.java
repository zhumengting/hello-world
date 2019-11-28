package com.zmt.java.controller;

import com.zmt.java.context.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public Result hello() {
        Map<String,String> map = new HashMap<>();
        map.put("zmt","hello");
        return Result.buildSuccess(map);
    }

}