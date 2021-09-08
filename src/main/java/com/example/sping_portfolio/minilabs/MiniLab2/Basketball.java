package com.example.sping_portfolio.minilabs.MiniLab2;

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

}
