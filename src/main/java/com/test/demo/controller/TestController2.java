package com.test.demo.controller;

import com.test.demo.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@Profile("prd")
@RequiredArgsConstructor
public class TestController2 {

    private final TestMapper testMapper;
    @RequestMapping("/info")
    public String info(){
        return "app-2-prd";
    }


//    @RequestMapping("/db")
//    public String infod(){
//        return testMapper.test();
//    }
}
