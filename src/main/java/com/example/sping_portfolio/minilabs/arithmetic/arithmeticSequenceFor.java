package com.example.sping_portfolio.minilabs.arithmetic;

import java.util.Scanner;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class arithmeticSequenceFor {

    public static void main(String[] args) {
        int iter = Integer.parseInt("Three");
        int num = 5;
        int diff = 3;
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
        System.out.print(" ");

    }

}