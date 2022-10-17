package ru.mirea.lab4;
import java.util.Scanner;
import java.lang.*;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public void seeMenu(){
        int n = -1;
        while (n != 0) {
            System.out.println("Введите 2, чтобы просмотреть каталог товаров \n Введите 1, чтобы просмотреть корзину \n Введите 0, чтобы выйти из магазина");
            n = sc.nextInt();
            switch (n){
                case 2 -> //seeCatalogue;
                case 1 -> //seeBucket
                case 0 -> return;
            }
        }

    }
    public void seeCatalogue(){
        int n = -1;
        while (n != 0){
            System.out.println("1.Ноутбуки \n 2.Телевизоры \n 3.Смартфоны \n 4.Планшеты \n 0.Выйти из каталога");
            n = sc.nextInt();
            switch (n){
                case 1 -> //enum ноуты
                case 2 -> //enum tv
                case 3 -> //enum smartphones
                case 4 -> //enum planshets
                case 0 -> seeMenu();
            }
        }
    }

    public void seeBucket(){
        int n = -1;
        System.out.println("Ваша корзина : \n 1.Оплатить 2.Продолжить покупки");
        switch (n){
            case 1 -> //buy
            case 2 -> seeCatalogue();
        }
    }
    public void buy(){
        int n = -1;
        System.out.println("Спасибо за покупку! Ваши товары : /n 1.Приобрести что-то ещё 0.Выйти"); //выводится бакет, бакет обнуляется и возвращаемся в меню
        switch (n){
            case 1 -> seeMenu();
            case 2 -> return;
        }
    }

}
