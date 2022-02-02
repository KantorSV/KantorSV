package com.app;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

    private String name;


    public MyClass(String name) {
        this.name = name;

    }

    public MyClass() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass " + "name: " + name + "\n Students ";
    }

}
