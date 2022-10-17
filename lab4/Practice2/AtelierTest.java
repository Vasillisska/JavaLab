package ru.mirea.lab4;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.L, 2.6, "red"  ),
                new TShirt(Sizes.S, 555, "blue"),
                new Tie(Sizes.S, 1111, "brown"),
                new Tie(Sizes.M, 22.678, "green"),
                new Skirt(Sizes.M, 0.1, "black"),
                new Skirt(Sizes.XXS, 2222231,"orange"),
                new Pants(Sizes.XS, 1.11123, "magenta"),
                new Pants(Sizes.S, 2845124, "purple")
        };

        Atelier test = new Atelier();
        test.dressMan(clothes);
        test.dressWoman(clothes);
    }
}
