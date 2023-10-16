package com.company;

import java.util.ArrayList;

public class TikTok {
    private ArrayList idols;
    private ArrayList songs;

    public TikTok(ArrayList idols, ArrayList songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public ArrayList getIdols() {
        return idols;
    }

    public void setIdols(ArrayList idols) {
        this.idols = idols;
    }

    public ArrayList getSongs() {
        return songs;
    }

    public void setSongs(ArrayList songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
