package ru.mirea.ikbo2019.iskhakov.pr1;

public class dog {
    int age;
    String name;
    public dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int res(int age){
        return this.age = 7*age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
