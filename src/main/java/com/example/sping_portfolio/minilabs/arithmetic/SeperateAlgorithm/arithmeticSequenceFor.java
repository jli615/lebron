package com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm;

import org.springframework.stereotype.Controller;

@Controller

public class arithmeticSequenceFor extends arithmeticSequenceMain {
    public arithmeticSequenceFor() { super(); }
    public arithmeticSequenceFor(int nth)
    {
        super(nth);
    }
    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        // for loops are likely the most common iteration structure, all the looping facts are in one line

    }

    /*
    Class method "main" with purpose of testing FibFor
     */
    public static void main(String[] args) {
        arithmeticSequenceMain arith1 = new arithmeticSequenceFor(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        arith1.print();
    }
}
