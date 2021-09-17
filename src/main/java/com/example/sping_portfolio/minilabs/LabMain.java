package com.example.sping_portfolio.minilabs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LabMain {
    @GetMapping("/bg")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "bg"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/koshybg")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting1(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "koshybg"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/bgr")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting3(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "bgr"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/rohanbg")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting4(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "rohanbg"; // returns HTML VIEW (greeting)
    }
}
