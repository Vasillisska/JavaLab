package ru.mirea.lab2;
import java.util.Scanner;
import java.lang.*;
public class ShopTest {
    public static void main(String[] args) {
        int n = 0;
        String computer = "";
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop(1);
        System.out.println("Введите начальное количество компьютеров ");
        n = sc.nextInt();
        shop.setN(n);
        shop.ShopInit();
        shop.AddComputer();
        shop.RemoveComputer();
    }
}
