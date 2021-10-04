package com.example.sping_portfolio.minilabs.factorial;

import java.util.ArrayList;

public class factWhile extends parentFactorial {
    public Integer factorial()
    {
        int iteration = 7;
        while(iteration > 0)
        {
            x = x * iteration;
            iteration--;
        }
        return (x);
    }
}
