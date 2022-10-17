package ru.mirea.lab2;
import java.util.*;
import java.lang.*;

public class Shop {
    String computer;
    String[] computers;
    int n;

    Scanner sc = new Scanner(System.in);

    public int getN(){
        return(n);
    }

    public void setN(int n){
        this.n = n;
    }

    public String getComputer(){
        return(computer);
    }

    public void setComputer(String computer){
        this.computer = computer;
    }

    public void ShopInit(){
        computers = new String[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите название компьютера");
            computers[i] = sc.next();
        }
        System.out.println("Список компьютеров - " + Arrays.asList(computers));
    }
    public Shop(int n){
        this.n = n;
    }
    public void AddComputer(){
        List<String> list = new ArrayList<>(Arrays.asList(computers));
        System.out.println("Введите название компьютера, который хотите добавить ");
        list.add(sc.next());
        computers = list.toArray(computers);
        System.out.println(Arrays.asList(computers));
    }

    public void RemoveComputer(){
        List<String> list = new ArrayList<>(Arrays.asList(computers));
        System.out.println("Введите название компьютера, который нужно удалить");
        list.remove(sc.next());
        computers = list.toArray(new String[0]);
        System.out.println(Arrays.asList(computers));
    }
}
