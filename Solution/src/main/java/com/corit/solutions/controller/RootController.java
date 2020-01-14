package com.corit.solutions.controller;

import com.corit.solutions.entities.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    
    @RequestMapping("/")
    public String index() {
        return "/index";
    }
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("users", new Users(""));
//        model.addAttribute("message",false);
        return "/register";
    }
  
    @RequestMapping("/afterLogin")
    public String forms(){
        return "/afterLogin";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "/contact";
    }
    @RequestMapping("/createDocument")
    public String createDocument(){
        return "/createDocument";
    }
   
    @RequestMapping(value="/login")
    public String login(){
        return "/login";
    }
    
}
