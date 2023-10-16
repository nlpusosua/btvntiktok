package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Idol> idols = new ArrayList<>();
        Idol idol1 = new Idol("Thang", 123,"nlp@",1,"java");
        System.out.println(idol1);

        ArrayList<Song> songs = new ArrayList<>();
        Song song1 =new Song(12,"IDGAF","Thang");
        System.out.println(song1);

        ArrayList<Follower> followers = new ArrayList<>();
        Follower follower1  = new  Follower("dat", 23, "dae@", 123132);
        System.out.println(follower1);



    }
}
