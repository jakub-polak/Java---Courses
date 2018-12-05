package com.jpolak;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));
        //tempExits.put("Q", 0);
                
        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));
        //tempExits.put("Q", 0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));
        //tempExits.put("Q", 0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));
        //tempExits.put("Q", 0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExits));
        //tempExits.put("Q", 0);


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String directionString = scanner.nextLine().toUpperCase();
            String direction = "";
            String[] directionSplitted = directionString.split(" ");
            for (int i = 0; i < directionSplitted.length; i++) {
                if (directionSplitted[i].compareTo("N") == 0 || directionSplitted[i].compareTo("NORTH") == 0) {
                    direction = "N";
                } else if (directionSplitted[i].compareTo("E") == 0 || directionSplitted[i].compareTo("EAST") == 0) {
                    direction = "E";
                } else if (directionSplitted[i].compareTo("S") == 0 || directionSplitted[i].compareTo("SOUTH") == 0) {
                    direction = "S";
                } else if (directionSplitted[i].compareTo("W") == 0 || directionSplitted[i].compareTo("WEST") == 0) {
                    direction = "W";
                } else if (directionSplitted[i].compareTo("Q") == 0 || directionSplitted[i].compareTo("QUIT") == 0) {
                    direction = "Q";
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
