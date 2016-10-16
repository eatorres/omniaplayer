package com.example.eduardo.omniaplayer;

/**
 * Created by Eduardo on 2016-09-08.
 */
public class Song {
    // Types
    private long id;
    private String title;
    private String artist;

    // Constructor
    public Song(long songID, String songTitle, String songArtist){
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    // Getters
    public long getID() {return id;}
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
}
