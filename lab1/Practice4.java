package ru.mirea.lab1;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (sc.hasNextInt())
            a = sc.nextInt();
        int[] b = new int[a];
        for (int i =0;i < a;i++){
            System.out.println("Введите элемент массива");
            if (sc.hasNextInt())
                b[i] = sc.nextInt();
        }
        int max = b[0], min = b[0], sum = 0, length = 0;
        while (length < a) {
            if (b[length] > max)
                max = b[length];
            if (b[length] < min)
                min = b[length];
            sum += b[length];
            length++;
        }
        System.out.println("Максимальный элемент массива - " + max);
        System.out.println("Минимальный элемент массива - " + min);
        System.out.println("Сумма всех элементов массива - " + sum);
    }
}
