package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @RequestMapping("/home")
    public String home(){
       System.out.println("This is home URL");
        return "home";
    }
    @RequestMapping("/About")
    public String about(){
        System.out.println("This is about URL");
        return "About";
    }
    @RequestMapping("/registration")
    public String registration(){
        System.out.println("This is registration URL");
        return "registration";
    }
    @RequestMapping(path="/processform", method= RequestMethod.POST)
    public String processform(@ModelAttribute User user, Model model){
        System.out.println(user);
        this.userService.createUser(user);
        return "home";
    }
}
