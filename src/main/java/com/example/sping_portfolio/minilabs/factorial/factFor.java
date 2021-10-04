package com.example.sping_portfolio.minilabs.factorial;
import com.example.sping_portfolio.minilabs.factorial.parentFactorial;

import java.time.Duration;
import java.time.Instant;


import java.util.ArrayList;

public class factFor extends parentFactorial
{
    public Integer factorial()
    {
        for(rotations=6;rotations > 0; rotations--)
        {
            x = x * rotations;
        }
        return (x);
    }

}