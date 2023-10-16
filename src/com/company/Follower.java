package com.company;

public class Follower {
    private String nameOfFollower;
    private int id;
    private String email;
    private int numberOfLike;

    public Follower(String nameOfFollower, int id, String email, int numberOfLike) {
        this.nameOfFollower = nameOfFollower;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getNameOfFollower() {
        return nameOfFollower;
    }

    public void setNameOfFollower(String nameOfFollower) {
        this.nameOfFollower = nameOfFollower;
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

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "nameOfFollower='" + nameOfFollower + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
