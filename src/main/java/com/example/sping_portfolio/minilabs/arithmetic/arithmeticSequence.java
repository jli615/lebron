package com.example.sping_portfolio.minilabs.arithmetic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class arithmeticSequence {

    public List<arithmeticSequence> arithmet(int nth) {
        //Fibonacci objects created with different initializers
        List<arithmeticSequence> arith = new ArrayList<>();
        arith.add(new arithmeticSequenceFor(nth));
        arith.add(new arithmeticSequenceRecursion(nth));
        arith.add(new arithmeticSequenceStream(nth));
        arith.add(new arithmeticSequenceWhile(nth));

        return arith;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/arithmetic")
    public String fib(@RequestParam(name="arithm", required=false,  defaultValue="2") String arithm, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(arithm);

        //MODEL attributes are passed back html
        model.addAttribute("arith", arithmet(nth));

        return "algorithms"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<arithmeticSequence> arith = new arithmeticSequence().arithmet(nth);
        for (arithmeticSequence Arithmetics : arith)
            Arithmetics.print();  //Console output fibonacci results
    }
}