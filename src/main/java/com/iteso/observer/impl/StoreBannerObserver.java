package com.iteso.observer.impl;

import com.iteso.observer.Observer;
import com.iteso.observer.Subject;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreBannerObserver implements Observer{
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    public StoreBannerObserver(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.name = storeName;
        scoresData1.registerObserver(this);
    }

    public void display() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);
    }


    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }
}
