package ru.mirea.lab1;

public class Practice6 {
    public static void main(String[] args) {
        String b = "1";
        System.out.println(b);
        for (int i = 2;i < 10; i++)
        {
            b = String.format("1/%s", i);
            System.out.println(b);
        }

    }
}
