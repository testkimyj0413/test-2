package com.test.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

@Controller
@ResponseBody
@Profile("dev")
public class TestController {


    @RequestMapping("/info")
    public String info(){
        return "app-2-dev";
    }
}
