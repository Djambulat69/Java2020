package ru.capchik.java2020.Ex3;

public class CircleTest {
    public static void main(String[] args){
        Circle c = new Circle(5.0);
        c.setRadius(6.0);
        System.out.println(c.getRadius());
        System.out.println(c.getLength());
        System.out.println(c.getSquare());
    }
}
