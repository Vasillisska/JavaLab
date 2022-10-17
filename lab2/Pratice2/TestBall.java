package ru.mirea.lab2;
import java.util.Scanner;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        double x = 0, y = 0, xDisp = 0, yDisp = 0;
        Scanner sc = new Scanner(System.in);
        Ball ball = new Ball(1.1, 2.1);
        System.out.println("Введите начальный x ");
        x = sc.nextDouble();
        System.out.println("Введите начальный y ");
        y = sc.nextDouble();
        System.out.println(ball.toString());
        System.out.println("Введите насколько изменился x ");
        xDisp = sc.nextDouble();
        System.out.println("Введите насколько изменился y ");
        yDisp = sc.nextDouble();
        ball.move(xDisp, yDisp);
        System.out.println("Новое положение мяча " + ball.toString());
    }
}
