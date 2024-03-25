package main.java.com.training.oop.Abstraction;

abstract class Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();

}

