package ru.capchik.java2020.Ex5_6;

public class Main {
    public static void main(String[] args) {
        MovableRectangle mrec = new MovableRectangle("Blue", true,10.0, 16.0, 1, 1);
        System.out.println(mrec.toString());
        mrec.move(5, 6);
        System.out.println(mrec.toString());

    }
}