package ru.mirea.ikbo2019.iskhakov.pr2;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ball ball = new ball(5, "баскетбол");
        Scanner scanPrice = new Scanner(System.in);
        Scanner scanColor = new Scanner(System.in);
        int price;
        String color;
        System.out.print("Введите цену мяча  -  ");
        price = scanPrice.nextInt();
        ball.setPrice(price);
        System.out.print("Введите название игры, в которой участники используют этот мяч - ");
        color = scanColor.nextLine();
        ball.setColor(color);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Стоимость мяча: " + ball.getPrice());
        System.out.println("Игровой мяч для " + ball.getColor() + "a.");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Вывод с помощью toString - " + ball.toString());


    }
}
