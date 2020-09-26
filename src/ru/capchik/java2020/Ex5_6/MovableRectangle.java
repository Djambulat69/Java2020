package ru.capchik.java2020.Ex5_6;

public class MovableRectangle extends Rectangle implements Movable {

        private MovablePoint topleft;
        private MovablePoint downright;

    public MovableRectangle(String color, boolean filled, double x1, double y1, double x2, double y2) {
        super(color, filled, x2 - x1, y1 - y2);
        topleft = new MovablePoint(x1, y1);
        downright = new MovablePoint(x2, y2);
    }

    @Override
        public void move(double right, double down) {
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

    @Override
    public void setLength(double length_) {
        downright.move(length_ - super.length, 0);
        super.setLength(length_);
    }

    @Override
    public void setWidth(double width_) {
        downright.move(0, width_ - super.width);
        super.setWidth(width_);
    }
}
