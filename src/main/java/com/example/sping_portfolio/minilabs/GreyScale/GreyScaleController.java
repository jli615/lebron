package com.example.sping_portfolio.minilabs.GreyScale;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



public class GreyScaleController {
    public class MainController {

        @GetMapping("/greet")
        // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
        public String greeting(@RequestParam(name = "GreyScale", required = false, defaultValue = "World") String GreyScale, Model model) {
            // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
            model.addAttribute("GreyScale", GreyScale);   // MODEL is passed to html
            return "GreyScaleController";                     // returns HTML VIEW (greeting)
        }
    }
}
