package main.java.com.training.oop.Abstraction;

public class Rectangle extends Shape {
    private double sideLength;
    private double sidebreath;

    public Rectangle(double sideLength, double sidebreath) {

        this.sideLength = sideLength;
        this.sidebreath = sidebreath;
    }

    public double getArea(){
        double sumArea = (sideLength * sidebreath);
        return sumArea;
    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
}



