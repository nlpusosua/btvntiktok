package com.company;

import java.util.ArrayList;

public class Idol  {
    private String nameOfIdol;
    private int id;
    private String email;
    private int followers;
    private String group;

    public Idol( String nameOfIdol, int id, String email, int followers, String group) {

        this.nameOfIdol = nameOfIdol;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public String getNameOfIdol() {
        return nameOfIdol;
    }

    public void setNameOfIdol(String nameOfIdol) {
        this.nameOfIdol = nameOfIdol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "nameOfIdol='" + nameOfIdol + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
