package ru.mirea.lab2;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
    public static Scanner sc = new Scanner(System.in);
    public static Book[] books;
    public static void main(String[] args) {
        int n = 0, year = 0;
        String name = "", author = "";
        System.out.println("Введите количество книг на полке");
        n = sc.nextInt();
        books = new Book[n];
        for (int i = 0;i < n;i++){
            Book book = new Book("0", "0", 0);
            System.out.println("Введите название книги");
            name = sc.next();
            book.setName(name);
            System.out.println("Введите имя автора");
            author = sc.next();
            book.setAuthor(author);
            System.out.println("Введите год издания книги");
            year = sc.nextInt();
            book.setYear(year);
            books[i] = book;
        }
        System.out.println("Книга с самым ранним годом издания - " + EarliestBook());
        System.out.println("Книга с самым поздним годом издания - " + LatestBook());
        sortByYear();
        System.out.println(Arrays.asList(books));
    }

    public static int EarliestBook(){
        int earliest = books[0].getYear();
        for (int i = 0;i < books.length; i++){
            if (books[i].getYear() < earliest)
                earliest = books[i].getYear();
        }
        return earliest;
    }

    public static int LatestBook(){
        int latest = books[0].getYear();
        for (int i = 0;i < books.length; i++){
            if (books[i].getYear() > latest)
                latest = books[i].getYear();
        }
        return latest;
    }

    public static void sortByYear(){
        Arrays.sort(books, Book::compareThem);
    }

}
