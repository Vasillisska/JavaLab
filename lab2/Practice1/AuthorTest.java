package ru.mirea.lab2;
import java.util.Scanner;
import java.lang.*;

public class AuthorTest {
    public static void main(String[] args) {
        String name = "", email = "";
        char Gender = ' ';
        Scanner sc = new Scanner(System.in);
        Author k1 = new Author("Vasya", "@gmail.com", 'm');
        System.out.println("Введите имя Автора");
        name = sc.nextLine();
        k1.setName(name);
        System.out.println("Введите email Автора");
        email = sc.nextLine();
        k1.setEmail(email);
        System.out.println("Введите пол Автора");
        Gender = sc.nextLine().charAt(0);
        k1.setGender(Gender);
        System.out.println(k1.toString());

    }
}
