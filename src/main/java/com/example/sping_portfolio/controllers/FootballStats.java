package com.example.sping_portfolio.controllers;

public class FootballStats {

    String playerName;
    double tds;
    boolean isMvp;

    public FootballStats(String name, Integer touchdowns, boolean mvp) {
        playerName = name;
        tds = touchdowns;
        isMvp = mvp;
    }

    public void checkTouchdowns() {
        if (tds > 0) {
            System.out.println(playerName + " scored " + (int) tds + " touchdowns this week!");
        } else {
            System.out.println(playerName + " did not score any touchdowns this week.");
        }
    }

    public static void main(String[] args){
        FootballStats martinHill = new FootballStats("Martin Hill", 3, true);
        martinHill.checkTouchdowns();
        FootballStats ryanMoghaddas = new FootballStats("Ryan Moghaddas", 0, false);
        ryanMoghaddas.checkTouchdowns();


    }

}

