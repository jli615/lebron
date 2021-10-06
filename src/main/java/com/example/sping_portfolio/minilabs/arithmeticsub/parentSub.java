package com.example.sping_portfolio.minilabs.arithmeticsub;

import java.util.ArrayList;

public abstract class parentSub
{
    int rotations;
    static int iter;
    static String iter1;
    int z =1000;
    ArrayList<Integer> art = new ArrayList<Integer>();
    public abstract ArrayList<Integer> arithmeticMethodone();
    public void print() {
        System.out.println("Arithmetic List = " + art);
    }
}
