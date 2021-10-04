package com.example.sping_portfolio.minilabs.arithmeticTwo;

import java.util.ArrayList;
import java.util.List;


public abstract class parentArithmetic
{
    int rotations;
    static boolean forr=false;
    static boolean stream=false;
    static boolean whilee=false;
    static boolean recurse=false;
    ArrayList<Integer> art = new ArrayList<Integer>();
    int x = 0;
    public abstract  ArrayList<Integer> arithmeticMethod();
    public void print() {
        System.out.println("Arithmetic List = " + art);
        }
}
