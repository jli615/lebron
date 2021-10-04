package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithRecurse extends parentArithmetic {
    public ArrayList<Integer> arithmeticMethodone()
    {
        return (recurse(5));
    }
    public ArrayList<Integer> recurse(int iterations) {
        int iter = iterations;
        if (iter == 0)
            return art;
        else {
            art.add(x+5);
            x+=5;
            return recurse(iter - 1);
        }
    }

    public ArrayList<Integer> recurse2(int iterations) {
        int iter = iterations;
        if (iter == 0)
            return time;
        else {
            time.add(z+5);
            z+=5;
            return recurse2(iter - 1);
        }
    }


    public Duration arithmeticMethodtwo()
    {
        Instant start = Instant.now();
        time = (recurse2(5));
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
        return (timeElapsed);
    }
}
