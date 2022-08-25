package com.controller;

import com.model.User;
import com.model.UserRole;
import com.service.UserService;
import com.service.userRoleService;
import com.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @Autowired
    userRoleService userRoleService;
    @RequestMapping("/registration")
    public String registration(){
        System.out.println("This is registration URL");
        return "registration";
    }
    @RequestMapping(path="/processform", method= RequestMethod.POST)
    //@GetMapping(path="/processform")
    public String processform(@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address, @RequestParam("username") String username, @RequestParam("pass") String pass, Model model){
        UserRole role = userRoleService.getRoleUser();
        System.out.println(role);
        List<UserRole> roles = new ArrayList<>();
        roles.add(role);
        System.out.println(roles);
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setAddress(address);
        user.setUsername(username);
        user.setPass(Util.encodePassword(pass));
        user.setRoles(roles);
        model.addAttribute("user",user);
        System.out.println(user);
        this.userService.createUser(user);
        return "redirect:/api/start/login";

    }

}
