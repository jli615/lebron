package com.example.sping_portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.sping_portfolio.minilabs.factorial.factFor;
import com.example.sping_portfolio.minilabs.factorial.factWhile;
import com.example.sping_portfolio.minilabs.factorial.factRecurse;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class factorialPage {
    @GetMapping("/factorialPage")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String factorialPage(Model model) {

        factFor ff = new factFor();
        int forAnswer = ff.factorial();

        factWhile fw = new factWhile();
        int whileAnswer = fw.factorial();

        factRecurse fr = new factRecurse();
        int recurseAnswer = fr.factorial();

        model.addAttribute("forAnswer", forAnswer);
        model.addAttribute("whileAnswer", whileAnswer);
        model.addAttribute("recurseAnswer", recurseAnswer);
        return "factorial"; // returns HTML VIEW (greeting)
    }

}


