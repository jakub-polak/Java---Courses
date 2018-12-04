package com.jpolak;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independant language");
            System.out.println("Java added!");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dybamic semantics");
        languages.put("Agol", "an algorithmic language");
        languages.put("BASIC", "beginners all purposes symbolic instruction code");
        languages.put("Lisp", "Therein lies madness");
        // languages.put("Lisp", "XXX"); // overwrite

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
        }
        System.out.println(languages.get("Lisp"));

        System.out.println("-----------------------------");

        //languages.remove("Lisp");
        if(languages.remove("Agol", "a family of algorithmic languages")) {
            System.out.println("Agol removed");
        } else {
            System.out.println("Agol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
