package ru.capchik.java2020.Ex3;

public class Circle {
    private double Radius;
    private double Square;
    private double Length;
    public void setRadius(double radius){Radius = radius;};
    public double getRadius(){return Radius;};
    public double getLength(){return 2*3.14*Radius;};
    public double getSquare(){return 3.14*Radius*Radius;};
    public Circle(double Radius)
    {
        this.Radius = Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
