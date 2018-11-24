package com.jpolak;

public class Gearbox {

    private boolean clunchIsIn;

    public void operateCluch (String inOrOut) {
        this.clunchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
