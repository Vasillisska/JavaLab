package ru.mirea.lab4;

public class TShirt extends Clothes implements MenClothing,WomanClothing{
    public TShirt(Sizes size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public String toString(){
        return ("Футболка" + " размер " + getSize() +
                " цвет " + getColour() +
                " цена " + getPrice());
    }
}
