package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class LoginController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("This is home URL");
        return "home";
    }
}
