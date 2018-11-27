package com.jpolak;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("Player " + player.getName() + " is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println("Playe " + player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int thierScore) {
        String message;
        if(ourScore > thierScore) {
            this.won++;
            message = "beat";
        } else if (ourScore < thierScore) {
            this.lost++;
            message = "lost to";
        } else {
            this.tied++;
            message = "drew with";
        }
        this.played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, thierScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }
}
