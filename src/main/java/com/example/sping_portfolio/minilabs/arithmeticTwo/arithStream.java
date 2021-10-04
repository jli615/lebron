package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class arithStream extends parentArithmetic{
    public ArrayList<Integer> arithmeticMethodone()
    {
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(iter)
                .forEach(f -> this.arithmeticMethodtwo());
        return art;
    }
    public void arithmeticMethodtwo()
    {
        art.add(z+5);
        z+=5;
    }
}
