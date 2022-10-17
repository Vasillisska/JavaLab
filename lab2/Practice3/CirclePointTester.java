package ru.mirea.lab2;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class CirclePointTester {
    public static void main(String[] args) {
        int n = 0;
        double r = 0;
        String colour = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        n = scanner.nextInt();
        CirclePoint[] array = new CirclePoint[n];
        for (int i = 0; i < n; i++) {
            CirclePoint circlePoint = new CirclePoint(0,0,0,"0");
            circlePoint.SetPoint();
            System.out.println("Введите радиус окружности");
            r = scanner.nextDouble();
            circlePoint.setR(r);
            System.out.println("Введите цвет окружности");
            colour = scanner.next();
            circlePoint.setColour(colour);
            array[i] = circlePoint;
        }
        System.out.println(Arrays.asList(array));
    }
}
