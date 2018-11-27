package com.jpolak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(joe);
        System.out.println(chelsea.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

    }
}
