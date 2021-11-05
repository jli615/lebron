package com.example.sping_portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SoccerPreformance {
    @GetMapping("/SoccerScoring")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String SoccerScoring() {
        return "SoccerScoring"; // returns HTML VIEW (greeting)
    }

}
