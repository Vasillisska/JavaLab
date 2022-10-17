package ru.mirea.lab2;
import java.util.Scanner;
import java.lang.*;

public class CirclePoint {
    private double x = 0, y = 0, r = 0;
    String colour = "";
    Scanner scanner = new Scanner(System.in);
    Point point = new Point(0, 0);

    public void SetPoint() {
        System.out.println("Задайте центр окружности");
        System.out.println("Введите x");
        x = scanner.nextDouble();
        point.setX(x);
        System.out.println("Введите y");
        y = scanner.nextDouble();
        point.setY(y);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        return ("CirclePoint{" +
                " x = " + x +
                " y = " + y +
                " r = " + r +
                " colour - " + colour +
                "}");
    }

    public CirclePoint(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

}
