package com.example.daybyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
/*    @GetMapping("/")
    public String index() {
        return "index";
    }*/


/*
        @GetMapping("/")
    public String excel() {
        return "/index";
    }
*/


    @GetMapping("/roadsmap.do")
    public String road() {
        return "roadmap/roadsmap";
    }
}

