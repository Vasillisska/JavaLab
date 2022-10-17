package ru.mirea.lab2;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DogTest {
    public static Dog[] dogs;
    static String name = "";
    static int age = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Введите количество собак");
        n = sc.nextInt();
        dogs = new Dog[n];
        for (int i = 0;i < n; i++) {
            Dog dog = new Dog("Sobaka",10);
            System.out.println("Введите кличку собаки");
            name = sc.next();
            dog.setName(name);
            System.out.println(dog.getName());
            System.out.println("Введите возраст собаки");
            age = sc.nextInt();
            dog.setAge(age);
            System.out.println(dog.getAge());
            dogs[i] = dog;
        }
        System.out.println(Arrays.asList(dogs));
        AddDog();
    }
    public static void AddDog() {
        Dog dog = new Dog("Sobaka",10);
        List<Dog> list = new ArrayList<>(Arrays.asList(dogs));
        System.out.println("Введите кличку новой собаки");
        name = sc.next();
        dog.setName(name);
        System.out.println("Введите возраст новой собаки");
        age = sc.nextInt();
        dog.setAge(age);
        list.add(dog);
        dogs = list.toArray(dogs);
        System.out.println(Arrays.asList(dogs));
    }

}
