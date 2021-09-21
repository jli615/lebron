package com.example.sping_portfolio.minilabs;

import java.util.Scanner;

public class arithmeticSequence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String startInput = input.nextLine();

        Scanner input1 = new Scanner(System.in);

        String diffInput = input1.nextLine();

        Scanner input2 = new Scanner(System.in);

        String iterInput = input2.nextLine();

        int start = Integer.parseInt(startInput);
        int diff = Integer.parseInt(diffInput);
        int iter = Integer.parseInt(iterInput);

        int num = start;
        int total = 0;


        for (int i = 0; i < iter; i++) {

            // Print the number
            System.out.print(num + " ");

            // increase sum
            total += num;

            // increase
            num += diff;
        }

        System.out.print("It took " + iter + " iterations of the while loop to reach " + total + ".");
        System.out.print("");

    }

}
