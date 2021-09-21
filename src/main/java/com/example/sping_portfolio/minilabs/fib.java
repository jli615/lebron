package com.example.sping_portfolio.minilabs;
import java.util.Scanner;

public class fib {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fibonacci. How many numbers of the Fibonacci sequence do you need?");

        String fib = input.nextLine();

        int fnum = Integer.parseInt(fib);

        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < fnum) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }

        int next = count + 1;

        System.out.print("It took " + count + " iterations of the while loop.");
        System.out.print("the " + next + " th number of the fibonacci sequence is " + num1);

    }
}
