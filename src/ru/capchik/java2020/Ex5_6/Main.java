package ru.capchik.java2020.Ex5_6;

public class Main {
    public static void main(String[] args) {
        MovableRectangle mrec = new MovableRectangle("Blue", true,0, 10,15,0);
        System.out.println(mrec);
        mrec.move(1, 1);
        System.out.println(mrec);
        mrec.setLength(mrec.getLength()*2);
        System.out.println(mrec);

    }
}
