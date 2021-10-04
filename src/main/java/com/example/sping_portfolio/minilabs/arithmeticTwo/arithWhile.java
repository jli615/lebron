package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithWhile extends parentArithmetic{
    public ArrayList<Integer> arithmeticMethodone()
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
    public Duration arithmeticMethodtwo()
    {
        Instant start = Instant.now();
        int iterations = 5;
        while(iterations > 0)
        {
            art.add(x+5);
            x+=5;
            iterations--;
        }
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
        return (timeElapsed);
    }
}
