package ru.capchik.java2020.Ex5_6;

public class MovableRectangle extends Rectangle implements Movable {

        private MovablePoint center;

    public MovableRectangle(String color, boolean filled, double width, double length, int x, int y) {
        super(color, filled, width, length);
        MovablePoint center = new MovablePoint(x, y);
    }

    @Override
        public void move(int right, int down) {
            center.move(right, down);
        }
}
