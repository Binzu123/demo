package main.java.com.training.oop.Abstraction.Interface;

class Circle implements Drawable {
    private double radius;
    @Override
    public void draw() {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);

    }

}
