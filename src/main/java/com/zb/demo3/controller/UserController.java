package com.zb.demo3.controller;

import com.zb.demo3.entity.User;
import com.zb.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/list")
    public String list(Model model, User user){
        model.addAttribute("users",userService.findAll(user));
        return "list";
    }

    @RequestMapping("/add")
    public String add(){

        return "addInfo";
    }

    
}
