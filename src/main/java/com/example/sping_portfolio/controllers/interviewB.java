package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class interviewB {
    @GetMapping("/interviewB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String interviewB() {
        return "interviewB"; // returns HTML VIEW (greeting)
    }

}
