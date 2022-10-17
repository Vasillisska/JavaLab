package ru.mirea.lab1;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        int a = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (sc.hasNextInt())
            a = sc.nextInt();
        System.out.println("Факториал числа " + a + " равен " + factorial(a));
    }

    public static int factorial(int b) {
        int factorial = 1;
        for (int i = 1; i <= b; i++){
            factorial *= i;
        }
        return (factorial);

    }
}
