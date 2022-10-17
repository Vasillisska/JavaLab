package ru.mirea.lab4;

public abstract class Clothes {
    private Sizes size;
    private double price;
    private String colour;

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void setSize(Sizes size){
        this.size = size;
    }

    public Sizes getSize(){
        return size;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
    public Clothes(Sizes size, double price, String colour){
        this.size = size;
        this.price = price;
        this.colour = colour;
    }
}
