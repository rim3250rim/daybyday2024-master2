package com.example.daybyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/guestloginform.do")
    public String guestloginForm(){
        return "login/guestlogin";
    }
}
