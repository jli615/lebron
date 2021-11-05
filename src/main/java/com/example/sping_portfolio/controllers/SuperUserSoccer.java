package com.example.sping_portfolio.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuperUserSoccer {
    @GetMapping("/SuperUserSoccer")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String SuperUserSoccer(@RequestParam(name="goalkeeper", required=false, defaultValue="Arturo Vargas") String goalkeeper, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("goalkeeper", goalkeeper); // MODEL is passed to html
        return "SuperUserSoccer"; // returns HTML VIEW (greeting)
    }
}
