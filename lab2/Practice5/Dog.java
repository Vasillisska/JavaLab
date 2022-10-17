package ru.mirea.lab2;

public class Dog {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void HumanAge(int age, int index){
        int humanAge = DogTest.dogs[index].getAge() * 7;
        System.out.println("Человеческий возраст собаки - " + humanAge);
    }

    public String toString(){
        return ("Кличка собаки - " + name +
                " возраст собаки - " + age);
    }
}
