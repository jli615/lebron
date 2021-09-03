package com.example.sping_portfolio.minilabs;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class soccer {
    @GetMapping("/soccer")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String soccer() {
        return "soccer"; // returns HTML VIEW (greeting)
    }
}
