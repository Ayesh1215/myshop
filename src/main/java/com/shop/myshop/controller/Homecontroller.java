package com.shop.myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {
@RequestMapping("/")
@ResponseBody
    public String greet(){
        return "welcome to my shop";
    }
}
