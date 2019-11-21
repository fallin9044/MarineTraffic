package com.marine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/18 11:19
 * @Description:
 */
@Controller
public class Hello {

    @RequestMapping(value = "/Hello")
    public String hello(){
        return "Map";
    }

}
