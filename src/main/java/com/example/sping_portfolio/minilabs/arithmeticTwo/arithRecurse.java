package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithRecurse extends parentArithmetic {
        public ArrayList<Integer> arithmeticMethodone()
        {
            return (recurse(iter));
        }
        public ArrayList<Integer> recurse(int iter1) {
            int iterations = iter1;
            if (iterations == 0)
                return art;
            else {
                art.add(z+5);
                z+=5;
                return recurse(iter1 - 1);
            }
        }

        public ArrayList<Integer> recurse2(int iter1) {
            int iterations = iter1;
            if (iterations == 0)
                return sran;
            else {
                sran.add(z+5);
                z+=5;
                return recurse2(iterations - 1);
            }
        }
    public Duration arithmeticMethodtwo()
    {
        Instant start = Instant.now();
        this.arithmeticMethodone();
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
        return (timeElapsed);
    }
}
