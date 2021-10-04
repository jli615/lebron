package com.example.sping_portfolio.minilabs.arithmeticTwo;
import java.util.Scanner;

public class arithmeticController
{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("How many iterations");
    String iterations = input.nextLine();
    int y = Integer.parseInt(iterations);
    parentArithmetic.iter=y;
    Scanner input1 = new Scanner(System.in);
    System.out.println("Which loop");
    String n = input1.nextLine();
    parentArithmetic arith1 = new arithFor();
    parentArithmetic arith2 = new arithRecurse();
    parentArithmetic arith3 = new arithStream();
    parentArithmetic arith4 = new arithWhile();
    if (n.equals("for"))
    {
        System.out.println("For loop");
        arith1.arithmeticMethodone();
        arith1.print();

    }
    if (n.equals("recurse"))
    {
        System.out.println("Recursion");
        arith2.arithmeticMethodone();
        arith2.print();
    }
    if (n.equals("stream"))
    {
        System.out.println("stream");
        arith3.arithmeticMethodone();
        arith3.print();
    }
    if (n.equals("while"))
    {
        System.out.println("While loop");
        arith4.arithmeticMethodone();
        arith4.print();
    }
}
}
