package com.example.sping_portfolio.controllers;

public class scheduleB {
    int age;
    int goals;
    int gameplayed;
    String name;
    String position;
    int number;

    public scheduleB(int ag, int goa, int gam, String nam, String pos, int num)
    {
        age = ag;
        goals = goa;
        gameplayed = gam;
        name = nam;
        position = pos;
        number = num;
    }
    public void displayAge()
    {
        System.out.println(age);
    }
    public void displayGoals()
    {
        System.out.println(goals);
    }
    public void displayGamesPlayed()
    {
        System.out.println(gameplayed);
    }
    public void displayName()
    {
        System.out.println(name);
    }
    public void displayPosition()
    {
        System.out.println(position);
    }
    public void displayNumber()
    {
        System.out.println(number);
    }
}
