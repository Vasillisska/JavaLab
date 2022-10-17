package ru.mirea.lab2;
import java.lang.*;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите слова через пробел");
        String input = sc.nextLine();
        if (input.length() != 0){
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){

                    count++;
                }
            }
        }
        System.out.println("Количество слов - " + count);

    }
}
