package com.jpolak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer kim = new BaseballPlayer("Kim");

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(joe);
        System.out.println(chelsea.numPlayers());

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
        newYorkYankees.addPlayer(kim);

        chicagoCubs.matchResult(newYorkYankees, 2, 0);

        System.out.println("Rankings");
        System.out.println(chicagoCubs.getName() + ": " + chicagoCubs.ranking());
        System.out.println(newYorkYankees.getName() + ": " + newYorkYankees.ranking());


        System.out.println(chicagoCubs.compareTo(newYorkYankees));
        System.out.println(newYorkYankees.compareTo(chicagoCubs));
    }
}
