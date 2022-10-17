package ru.mirea.lab2;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class CirceComparatorTester {
    public static CircleComparator[] array;
    public static void main(String[] args) {
        int n = 0;
        double x = 0, y = 0, r = 0;
        String colour = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        n = scanner.nextInt();
        array = new CircleComparator[n];
        for (int i = 0; i < n; i++) {
            CircleComparator cC = new CircleComparator(0,0,0,"0");
            System.out.println("Введите координаты окружности по x");
            x = scanner.nextDouble();
            cC.setX(x);
            System.out.println("Введите координаты окружности по y");
            y = scanner.nextDouble();
            cC.setY(y);
            System.out.println("Введите радиус окружности");
            r = scanner.nextDouble();
            cC.setR(r);
            System.out.println("Введите цвет окружности");
            colour = scanner.next();
            cC.setColour(colour);
            array[i] = cC;
        }
        System.out.println(Arrays.asList(array));
        if (n > 1)
            CircleComparator.Comparator(0,1);
    }
}
