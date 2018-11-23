package com.jpolak;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song. XXX
// The program will have an Album class containing a list of songs. XXX
// The albums will be stored in an ArrayList XXX
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

        Album theBlackAlbum = new Album("Metallica", "The Black Album");
        theBlackAlbum.addSongToAlbum(new Song("Enter Sandman", "5min 31s"));
        theBlackAlbum.addSongToAlbum(new Song("Sad But True", "5min 24s"));
        theBlackAlbum.addSongToAlbum(new Song("Nothing Else Matters", "6min 28s"));
        theBlackAlbum.addSongToAlbum(new Song("The Unforgiven", "6min 27s"));
        theBlackAlbum.printSongList();

        Album highVoltage = new Album("AC/DC", "High Voltage");
        highVoltage.addSongToAlbum(new Song("T.N.T", "3min 34s"));
        highVoltage.addSongToAlbum(new Song("Rock 'n' Roll Singer", "5min 3s"));
        highVoltage.addSongToAlbum(new Song("High Voltage", "4min 4s"));
        highVoltage.addSongToAlbum(new Song("Little Lover", "5min 39s"));
        highVoltage.printSongList();

        LinkedList<Song> playList = new LinkedList<Song>();
        highVoltage.addSongToPlaylist("T.N.T", playList);
        highVoltage.addSongToPlaylist("Little Lover", playList);
        theBlackAlbum.addSongToPlaylist("Enter Sandman", playList);
        theBlackAlbum.addSongToPlaylist("Sad But True", playList);

        printList(playList);
        printMenu();
        play(playList);
    }


    private static void printMenu() {
        System.out.println("Available actions:\n");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
        System.out.println("================================");
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("You have reached the end of the playlist");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("You are at the start of the list");
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().getTitle());
                        }
                        forward = false;
                    } else if (!forward) {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().getTitle());
                        }
                        forward = true;
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    listIterator.remove();
                    System.out.println("You have removed a song");
                    printList(playList);
                    break;
            }
        }

    }


}
