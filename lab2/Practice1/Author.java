package ru.mirea.lab2;
import java.util.Scanner;

public class Author {
    private String name = "", email = "";
    private char Gender = ' ';

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public Author(String name, String email, char Gender) {
        this.name = name;
        this.email = email;
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return ("Author{" +
                "name = " + name +
                " email = " + email +
                " Gender = " + Gender +
                "}" );
    }
}
