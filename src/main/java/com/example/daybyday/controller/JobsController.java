package com.example.daybyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobsController {

    @GetMapping("/jobis.do")
    public String jobis() {
        return "jobs/jobs";
    }



}


