package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.Instant;


public abstract class parentArithmetic
{
    int rotations;
    Duration timeElapsed;
    static boolean forr=false;
    static boolean stream=false;
    static boolean whilee=false;
    static boolean recurse=false;
    ArrayList<Integer> art = new ArrayList<Integer>();
    int x = 0;
    public abstract ArrayList<Integer> arithmeticMethodone();
    public abstract Duration arithmeticMethodtwo();
    public void print() {
        System.out.println("Arithmetic List = " + art);
        System.out.println("Process took " + timeElapsed);
        }
}
