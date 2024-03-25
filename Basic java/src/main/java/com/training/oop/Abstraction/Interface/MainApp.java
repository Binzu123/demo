package main.java.com.training.oop.Abstraction.Interface;

public class MainApp {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
        System.out.println("Area of Circle : " + circle.getArea());
    }
}
