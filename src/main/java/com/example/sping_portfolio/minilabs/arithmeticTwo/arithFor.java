package com.example.sping_portfolio.minilabs.arithmeticTwo;
import com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm.arithmeticSequenceMain;
import com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm.arithmeticSequenceRecursion;
import java.time.Duration;
import java.time.Instant;


import java.util.ArrayList;

public class arithFor extends parentArithmetic
{
    public ArrayList<Integer> arithmeticMethodone()
    {
        for(rotations=iter;rotations > 0; rotations--)
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
