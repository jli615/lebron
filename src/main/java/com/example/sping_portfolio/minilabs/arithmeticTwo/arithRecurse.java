package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class arithRecurse extends parentArithmetic {
        private int l=0;
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
}
