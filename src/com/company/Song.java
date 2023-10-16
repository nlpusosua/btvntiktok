package com.company;

import java.util.ArrayList;

public class Song {
    private int id;
    private String name;
    private String nameOfSinger;

    public Song(int id, String name, String nameOfSinger) {

        this.id = id;
        this.name = name;
        this.nameOfSinger = nameOfSinger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfSinger() {
        return nameOfSinger;
    }

    public void setNameOfSinger(String nameOfSinger) {
        this.nameOfSinger = nameOfSinger;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameOfSinger='" + nameOfSinger + '\'' +
                '}';
    }
}
