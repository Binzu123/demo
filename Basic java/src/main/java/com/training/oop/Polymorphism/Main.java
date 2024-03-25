package main.java.com.training.oop.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myDog.animalSound();
    }
}
