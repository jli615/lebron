package com.example.sping_portfolio.minilabs.arithmeticsub;
import java.util.Scanner;

public class arithmeticsubController
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many iterations");
        String iterations = input.nextLine();
        int y = Integer.parseInt(iterations);
        parentSub.iter=y;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Which loop");
        String n = input1.nextLine();
        parentSub sub1 = new subFor();
        parentSub sub2 = new subRecurse();
        parentSub sub3 = new subStream();
        parentSub sub4 = new subWhile();
        if (n.equals("for"))
        {
            System.out.println("For loop");
            sub1.arithmeticMethodone();
            sub1.print();

        }
        if (n.equals("recurse"))
        {
            System.out.println("Recursion");
            sub2.arithmeticMethodone();
            sub2.print();
        }
        if (n.equals("stream"))
        {
            System.out.println("stream");
            sub3.arithmeticMethodone();
            sub3.print();
        }
        if (n.equals("while"))
        {
            System.out.println("While loop");
            sub4.arithmeticMethodone();
            sub4.print();
        }
    }
}