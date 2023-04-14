package com.genspark.SpringBootdemoApplication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_albums")
public class Album {
    @Id
    @Column(name="a_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int albumid;
    private String title;
    private String artist;
    private int year;
    private String genre;

    public Album() {
    }

    public Album(String title, String artist, int year, String genre) {
        this.albumid = albumid;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    public int getAlbumid() {
        return albumid;
    }

    public void setAlbumid(int albumid) {
        this.albumid = albumid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
