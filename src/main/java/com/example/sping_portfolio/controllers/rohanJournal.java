package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rohanJournal {
    @GetMapping("/rohanjournal")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutUsRyan() {
        return "rohanjournal"; // returns HTML VIEW (greeting)
    }
}