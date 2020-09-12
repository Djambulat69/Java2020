package ru.capchik.java2020.Ex3;

public class Hand {
    private int n_fingers;
    private String dir;

    @Override
    public String toString() {
        return "Hand{" +
                "n_fingers=" + n_fingers +
                ", dir='" + dir + '\'' +
                '}';
    }

    public Hand(int fingers, String dir)
    {
        n_fingers = fingers;
        this.dir = dir;
    }

    public int getN_fingers() {
        return n_fingers;
    }

    public void setN_fingers(int n_fingers) {
        this.n_fingers = n_fingers;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }
}
