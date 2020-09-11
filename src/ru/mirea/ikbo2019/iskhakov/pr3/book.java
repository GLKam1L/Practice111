package ru.mirea.ikbo2019.iskhakov.pr3;

public class book {
    int pages;
    String name;
    String a;
    public book(int pages, String name, String a){
        this.pages = pages;
        this.name = name;
        this.a = a;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "book{" +
                "pages=" + pages +
                ", name='" + name + "a=" + a + '\'' +
                '}';
    }
}
