package ru.capchik.java2020.Ex3;

public class Head {
    private int n_eyes;
    private int n_ears;

    public Head(int eyes,int ears){
        n_eyes = eyes;
        n_ears = ears;
    }
    @Override
    public String toString() {
        return "Head{" +
                "n_eyes=" + n_eyes +
                ", n_ears=" + n_ears +
                '}';
    }

    public void setN_ears(int n_ears) {
        this.n_ears = n_ears;
    }

    public int getN_ears() {
        return n_ears;
    }

    public void setN_eyes(int n_eyes) {
        this.n_eyes = n_eyes;
    }

    public int getN_eyes() {
        return n_eyes;
    }
}
