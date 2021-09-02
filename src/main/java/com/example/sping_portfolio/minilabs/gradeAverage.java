package com.example.sping_portfolio.minilabs;

public class gradeAverage {
    public static void main (String[] args) {
        int gradeOne = 97;
        int gradeTwo = 92;
        int gradeThree = 83;
        int gradeFour = 91;
        int gradeFive = 95;

        double gradeOneTwo = (gradeOne + gradeTwo) / 2;
        double gradeThreeFour = (gradeThree + gradeFour) / 2;

        double finalAvg = (gradeOneTwo * 2 + gradeThreeFour * 2 + gradeFive) / 5;

        String averageGrade;
        System.out.println("The final average grade is " + averageGrade);

    }
    }