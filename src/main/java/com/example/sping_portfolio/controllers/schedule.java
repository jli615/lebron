package com.example.sping_portfolio.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
@EnableCaching
public class schedule {
    @GetMapping("/scheduleB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String scheduleB() {

        return "scheduleB"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/scheduleBB")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String scheduleBB() {
        return "scheduleBB"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/scheduleF")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String scheduleF() {

        return "statsF"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/scheduleS")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String scheduleS() {

        return "scheduleS"; // returns HTML VIEW (greeting)
    }
}
