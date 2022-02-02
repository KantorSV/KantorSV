package com.app01;

public class Students {

    private String name;
    private int age;
    private int iq;
    private int id;

    public Students(String name, int age, int iq, int id) {
        this.name = name;
        this.age = age;
        this.iq = iq;
        this.id=id;
    }

    public Students(){}

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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", id=" + id +
                '}';
    }
}
