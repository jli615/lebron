package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class interviewBB {
    @GetMapping("/interviewBB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String interviewBB() {
        return "interviewBB"; // returns HTML VIEW (greeting)
    }

}

