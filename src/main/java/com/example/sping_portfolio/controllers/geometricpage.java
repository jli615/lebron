package com.example.sping_portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.sping_portfolio.minilabs.geometric.geoFor;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class geometricpage {
    @GetMapping("/geometricpage")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String geometricpage(Model model) {

        geoFor ff = new geoFor();
        int forAnswer = ff.geometric();

        model.addAttribute("forAnswer", forAnswer);
        return "geometric"; // returns HTML VIEW (greeting)
    }

}

