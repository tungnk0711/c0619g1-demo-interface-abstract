package com.codegym;

public abstract class Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();

    public abstract void run();

    public void show(){
        System.out.println("hello");
    }
}
