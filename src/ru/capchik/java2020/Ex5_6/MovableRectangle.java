package ru.capchik.java2020.Ex5_6;

public class MovableRectangle extends Rectangle implements Movable {

        private MovablePoint topleft;
        private MovablePoint downright;

    public MovableRectangle(String color, boolean filled, int x1, int y1, int x2, int y2) {
        super(color, filled, x1 - x2, y1 - y2);
        topleft = new MovablePoint(x1, y1);
        downright = new MovablePoint(x2, y2);
    }

    @Override
        public void move(int right, int down) {
            topleft.move(right, down);
            downright.move(right, down);
        }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft=" + topleft +
                ", downright=" + downright +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
