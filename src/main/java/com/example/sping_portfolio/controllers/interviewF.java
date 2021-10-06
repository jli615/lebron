package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class interviewF {
    @GetMapping("/interviewF")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String interviewF() {
        return "interviewF"; // returns HTML VIEW (greeting)
    }

}
