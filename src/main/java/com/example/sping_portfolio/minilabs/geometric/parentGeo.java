package com.example.sping_portfolio.minilabs.geometric;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.Instant;

public abstract class parentGeo {
    int rotations;
    static int iter;
    int z =1;
    //int k =0;
    //Duration timeElapsed;
    static boolean forr=true;
    //static boolean stream=false;
    //static boolean while=false;
    //static boolean recurse=false;
    ArrayList<Integer> art = new ArrayList<Integer>();
    //ArrayList<Integer> sran = new ArrayList<Integer>();
    public abstract ArrayList<Integer> geometricMethodone();
    //public abstract Duration geometricMethodtwo();
    public void print() {
        System.out.println("Geometric List = " + art);
        //System.out.println("Process took " + timeElapsed);
    }
}
