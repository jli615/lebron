package com.example.sping_portfolio.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
@EnableCaching
public class Stats {
    @GetMapping("/statsB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String statsB() {

        return "statsB"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/statsBB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String statsBB() {
        return "statsBB"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/statsF")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String statsF() {

        return "statsF"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/statsS")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String statsS() {

        return "statsS"; // returns HTML VIEW (greeting)
    }
}


