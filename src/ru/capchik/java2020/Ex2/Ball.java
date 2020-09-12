package ru.capchik.java2020.Ex2;

public class Ball {
    private int radius;
    private int weight;
    public Ball(int radius, int weight)
    {
        this.radius = radius;
        this.weight = weight;
    }
    public int getRadius(){
        return radius;
    }
    public int getWeight(){
        return weight;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", weight=" + weight +
                '}';
    }
}
