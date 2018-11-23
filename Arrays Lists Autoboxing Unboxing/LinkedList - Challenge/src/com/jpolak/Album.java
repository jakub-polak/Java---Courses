package com.jpolak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String title;
    private ArrayList<Song> songList;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songList = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void addSongToAlbum(Song song) {
        this.songList.add(song);
        //System.out.println("Song " + song.getTitle() + " has been added to " + this.getArtist() + ": " + this.getTitle());
    }

    public void addSongToPlaylist(String songTitle, LinkedList<Song> playList) {
        playList.add(findSong(songTitle));
        System.out.println("Song " + songTitle + " has been added to your playlist");
    }

    public Song findSong(String title) {
        for(int i = 0; i < songList.size();i++) {
            if(songList.get(i).getTitle().equals(title)) {
                return songList.get(i);
            }
        }
        return null;
    }

    public void printSongList() {
        System.out.println("Artist: " + this.getArtist() + "\nAlbum: " + this.getTitle());
        for (int i = 0; i < songList.size(); i++) {
            System.out.println((i + 1) + ". " + songList.get(i).getTitle() + " - " + songList.get(i).getDuration());
        }

    }
}
