package ru.mirea.lab1;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0, mean = 0;
        int[] b = {5, 7, 8, 9, 13, 229, 1336, 39495};
        for (int i =0; i< b.length;i++) {
            sum += b[i];
        }
        mean = sum/b.length;
        System.out.println("Сумма всех элементов массива - " + sum);
        System.out.println("Среднее арифметическое - " + mean);
    }
}
