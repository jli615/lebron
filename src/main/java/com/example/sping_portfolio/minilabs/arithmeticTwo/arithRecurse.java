package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithRecurse extends parentArithmetic {
    public ArrayList<Integer> arithmeticMethodone()
    {

        for(rotations=5;rotations > 0; rotations--)
        {
            art.add(z+5);
            z+=5;
        }
        return (art);
    }
    public Duration arithmeticMethodtwo()
    {
        Instant start = Instant.now();
        for(rotations=iter;rotations > 0; rotations--)
        {
            sran.add(k+5);
            k+=5;
        }
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
        return (timeElapsed);
    }
}
