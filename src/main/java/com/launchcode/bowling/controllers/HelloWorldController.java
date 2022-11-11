package com.launchcode.bowling.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(value = "")
    public String welcome() {
        return "hello";
    }

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "something";
    }

}