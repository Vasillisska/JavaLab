package ru.mirea.lab4;

public class Pants extends Clothes implements MenClothing,WomanClothing{
    public Pants(Sizes size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public String toString(){
        return ("Штаны" + " размер " + getSize() +
                " цвет " + getColour() +
                " цена " + getPrice());
    }
}
