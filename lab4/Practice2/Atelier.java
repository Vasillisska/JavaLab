package ru.mirea.lab4;

public class Atelier {
    public void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда в наличии :");
        for (Clothes clothe : clothes)
            if (clothe instanceof MenClothing)
                System.out.println(clothe + "\n");
    }

    public void dressWoman(Clothes[] clothes){
        System.out.println("Женская одежда в наличии :");
        for (Clothes clothe : clothes)
            if (clothe instanceof WomanClothing)
                System.out.println(clothe + "\n");
    }
}
