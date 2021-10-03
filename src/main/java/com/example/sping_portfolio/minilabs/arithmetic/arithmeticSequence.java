package com.example.sping_portfolio.minilabs.arithmetic;

import com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class arithmeticSequence {

    public List<arithmeticSequenceMain> arithmet(int nth) {
        //        //Fibonacci objects created with different initializers
        List<arithmeticSequenceMain> arithList = new ArrayList<>();
        arithList.add(new arithmeticSequenceFor(nth));
        arithList.add(new arithmeticSequenceRecursion(nth));
        arithList.add(new arithmeticSequenceStream(nth));
        arithList.add(new arithmeticSequenceWhile(nth));

        return arithList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/arithmetic")
    public String fib(@RequestParam(name="arithm", required=false,  defaultValue="2") String arithm, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(arithm);

        //MODEL attributes are passed back html
        model.addAttribute("arithList", arithmet(nth));

        return "algorithms"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<arithmeticSequenceMain> arith = new arithmeticSequence().arithmet(nth);
        for (arithmeticSequenceMain Arithmetics : arith)
            Arithmetics.print();  //Console output fibonacci results
    }
}