package ru.mirea.lab4;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double price, String colour) {
        super(size, price, colour);
    }
    @Override
    public String toString(){
        return ("Галстук" + " размер " + getSize() +
                " цвет " + getColour() +
                " цена " + getPrice());
    }
}
