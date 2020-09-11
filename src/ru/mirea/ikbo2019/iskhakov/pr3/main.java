package ru.mirea.ikbo2019.iskhakov.pr3;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        book book = new book(678,"Михаил Булгаков", "Мастер и Маргарита");
        Scanner scanPages = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Scanner scanA = new Scanner(System.in);
        int pages;
        String name;
        String a;
        System.out.print("Введите количество страниц: ");
        pages = scanPages.nextInt();
        book.setPages(pages);
        System.out.print("Введите имя автора: ");
        name = scanName.nextLine();
        book.setName(name);
        System.out.print("Введите название книги: ");
        a = scanA.nextLine();
        book.setA(a);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Количество страниц - " + book.getPages());
        System.out.println("Автор - " + book.getName());
        System.out.println("Название - " + book.getA());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Вывод с помощью toString - " + book.toString());


    }
}
