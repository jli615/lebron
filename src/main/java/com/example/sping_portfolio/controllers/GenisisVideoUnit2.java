package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenisisVideoUnit2 {
    @GetMapping("/genisisvidu2")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String genisisvidu2() {
        return "genisisvidu2"; // returns HTML VIEW (greeting)
    }
}
