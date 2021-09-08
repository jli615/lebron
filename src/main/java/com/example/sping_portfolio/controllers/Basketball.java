package com.example.sping_portfolio.controllers;

public class Basketball {
    private int age;
    private double height;
    private String name;
    public Basketball(int ag,double he, String nam)
    {
        age = ag;
        height = he;
        name = nam;
    }
public void verbalTalk()
        {
        if(age >= 18)
        {
            System.out.println(name + " basketball player");
            System.out.println("Go to the league big man");
            System.out.println("");
        }
        else
            {
                System.out.println(name + " basketball player.");
                System.out.println("Stay in high school.");
            }
    }
    public static void main(String[] args)
    {
        Basketball newplayerOne = new Basketball(27,62.5,"Dante");
        Basketball newplayerTwo = new Basketball(17,60.5,"Tyrone");
        newplayerOne.verbalTalk();
        newplayerTwo.verbalTalk();
    }

}
