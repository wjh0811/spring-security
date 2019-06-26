package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springsecurity
 * @description:
 * @author: Cloud.
 * @create: 2019-06-26 20:35
 */
@Controller
public class WebPageController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){

        return "hello ! spring security";
    }


}
