package com.miniproj.a4.crimems.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomeController {  
	
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }
}