package main.java.com.training.oop.Encapsulation;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        MainApp ma = new MainApp();
        ma.convertDollarToNu();
    }

    private void convertDollarToNu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in Dollar: ");
        float dollarAmount = scanner.nextFloat();
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.setAmountInDollar(dollarAmount);
        float exchangedAmountForCustomer = currencyConverter.getAmountInNu();
        System.out.println("Total Amount in Bhutanese Currency is: "+ exchangedAmountForCustomer);
    }
}