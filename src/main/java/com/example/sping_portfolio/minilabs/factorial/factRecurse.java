package com.example.sping_portfolio.minilabs.factorial;

import java.util.ArrayList;

public class factRecurse extends parentFactorial{
    public Integer factorial()
    {
        return (recurse(iter));
    }
    public Integer recurse(int iter1) {
        int iterations = iter1;
        if (iterations == 0)
            return x;
        else {
            x = x * iter1;
            return recurse(iter1 - 1);
        }
    }
}
