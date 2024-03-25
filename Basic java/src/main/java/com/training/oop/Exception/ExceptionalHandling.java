package main.java.com.training.oop.Exception;



import java.util.Scanner;

public class ExceptionalHandling {
    public static void main(String[] args) {
        ExceptionalHandling test = new ExceptionalHandling();
        test.execute();
    }

    private void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number[0-9]:");
        int enteredNumber = 0;

        try {
            enteredNumber = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Entered input is not of correct. Please Enter number from [0-9]");
            enteredNumber = scanner.nextInt();
        } finally{
            System.out.println("This block is always called!!");
        }
        System.out.println("The Entered Number is: " + enteredNumber);
    }
}