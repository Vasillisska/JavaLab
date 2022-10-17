package ru.mirea.lab2;
import java.lang.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Practice8 {
    public static String array[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите размер массива");
        n = sc.nextInt();
        array = new String[n];
        for (int i = 0;i < n;i++)
        {
            System.out.println("Введите элемент массива");
            array[i] = sc.next();
        }
        System.out.println("Ваш массив - " + Arrays.asList(array));
        Collections.reverse(Arrays.asList(array));
        System.out.println((Arrays.asList(array)));
    }
}
