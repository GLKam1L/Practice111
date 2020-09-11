package ru.mirea.ikbo2019.iskhakov.pr2;

public class ball {
    int price;
    String color;
    public ball(int price, String color){
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int a) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ball{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
