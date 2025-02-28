package com.EMS.employee_management_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
