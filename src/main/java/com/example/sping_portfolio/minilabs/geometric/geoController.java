package com.example.sping_portfolio.minilabs.geometric;
import java.util.Scanner;

public class geoController
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many terms would you like to see?");
        String numberofterms = input.nextLine();
        int y = Integer.parseInt(numberofterms);
        parentGeo.iter=y;
        parentGeo geo1 = new geoFor();
        //parentGeo arith2 = new arithRecurse();
        //parentGeo arith3 = new arithStream();
        //parentGeo arith4 = new arithWhile();
        parentGeo.forr = true;
        //parentGeo.recurse = true;
        if (parentGeo.forr == true)
        {
            geo1.geometricMethodone();
            //geo1.geometricMethodtwo();
            geo1.print();

        }
        /*if (parentArithmetic.recurse == true)
        {
            arith2.arithmeticMethodone();
            arith2.print();
        }
        if (parentArithmetic.stream == true)
        {
            arith3.arithmeticMethodone();
            arith3.print();
        }
        if (parentArithmetic.whilee == true)
        {
            arith4.arithmeticMethodone();
            arith4.print();
        }
        */
    }
}