package ru.mirea.lab4;

public class Skirt extends Clothes implements WomanClothing{
    public Skirt(Sizes size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public String toString(){
        return ("Юбка" + " размер " + getSize() +
                " цвет " + getColour() +
                " цена " + getPrice());
    }
}
