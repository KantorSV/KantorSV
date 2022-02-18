package com.app;

public class Car {

    private String name;
    private int age;
    private int price;

    public Car(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public Car() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car" + "\nname = " + name + "\nage = " + age + "\nprice = " + price;
    }
}
