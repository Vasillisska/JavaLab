package ru.mirea.lab2;

public class Point {
    private double x = 0, y = 0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("Point{" +
                " x = " + x +
                " y  = " + y +
                " }");

    }

}
