package com.app01;

public class Training {
    private String name;
    private String type;
    private int id;

    public Training(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public Training() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Training{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
