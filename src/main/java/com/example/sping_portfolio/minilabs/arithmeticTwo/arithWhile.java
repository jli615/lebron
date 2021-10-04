package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithWhile extends parentArithmetic{
    public ArrayList<Integer> arithmeticMethodone()
    {
        int iteration = iter;
        while(iteration > 0)
        {
            art.add(z+5);
            z+=5;
            iteration--;
        }
        return (art);
    }
    public Duration arithmeticMethodtwo()
    {
        Instant start = Instant.now();
        int iterations = 5;
        while(iterations > 0)
        {
            sran.add(k+5);
            k+=5;
            iterations--;
        }
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
        return (timeElapsed);
    }
}
