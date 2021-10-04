package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.util.ArrayList;

public class arithWhile extends parentArithmetic{
    public ArrayList<Integer> arithmeticMethod()
    {
        int iterations = 5;
        while(iterations > 0)
        {
            art.add(x+5);
            x+=5;
            iterations--;
        }
        return (art);
    }
}
