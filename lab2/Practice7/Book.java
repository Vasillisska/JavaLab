package ru.mirea.lab2;

public class Book {
    private String author, name;

    private int year;

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){
        return ("Название книги - " + name +
                " имя автора - " + author +
                " год издания книги - " + year +
                " ");
    }

    public static int compareThem(Book a, Book b) {
        return new Integer(a.getYear()).compareTo(new Integer(b.getYear()));
    }
}
