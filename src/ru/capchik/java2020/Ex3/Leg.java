package ru.capchik.java2020.Ex3;

public class Leg {
    private int n_toes;
    private String dir;

    public Leg(int fingers, String dir)
    {
        n_toes = fingers;
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "n_toes=" + n_toes +
                ", dir='" + dir + '\'' +
                '}';
    }

    public int getN_fingers() {
        return n_toes;
    }

    public void setN_fingers(int n_fingers) {
        this.n_toes = n_fingers;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }
}
