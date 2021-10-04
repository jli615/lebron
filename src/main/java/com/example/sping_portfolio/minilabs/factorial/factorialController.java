package com.example.sping_portfolio.minilabs.factorial;
import com.example.sping_portfolio.minilabs.arithmeticTwo.arithRecurse;
import com.example.sping_portfolio.minilabs.arithmeticTwo.arithStream;
import com.example.sping_portfolio.minilabs.arithmeticTwo.arithWhile;
import com.example.sping_portfolio.minilabs.arithmeticTwo.parentArithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class factorialController
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which factorial?");
        String iterations = input.nextLine();
        int y = Integer.parseInt(iterations);
        parentFactorial.iter=y;
        parentFactorial fact1 = new factFor();
        parentFactorial fact2 = new factWhile();
        parentFactorial fact3 = new factRecurse();
        //parentFactorial fact4 = new factStream();

        parentFactorial.forr = true;
        parentFactorial.whilee = true;
        parentFactorial.recurse = true;

        System.out.println("For Loop");
        if (parentFactorial.forr == true)
        {
            fact1.factorial();
            fact1.print();
        }

        System.out.println("While Loop");
        if (parentFactorial.whilee== true)
        {
            fact2.factorial();
            fact2.print();
        }

        System.out.println("Recursion");
        if (parentFactorial.recurse == true)
        {
            fact3.factorial();
            fact3.print();
        }
    }
}

