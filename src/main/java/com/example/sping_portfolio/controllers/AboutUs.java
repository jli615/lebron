package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUs {
    @GetMapping("/aboutUs")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutUs() {
        return "aboutUs"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/aboutUsKoshy")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutUsKoshy() {

        return "aboutUsKoshy"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/aboutUsRohan")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutUsRohan() {

        return "aboutUsRohan"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/aboutUsRyan")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutUsRyan() {

        return "aboutUsRyan"; // returns HTML VIEW (greeting)
    }
}
