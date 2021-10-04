package com.example.sping_portfolio.minilabs.geometric;

import java.time.Duration;
import java.time.Instant;

import java.util.ArrayList;

public class geoFor extends parentGeo{
    public Integer geometric()
    {
        for(rotations=7;rotations > 0; rotations--)
        {
            z*=2;
        }
        return (z);
    }
    /*public Duration geometricMethodtwo()
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
    */
}
