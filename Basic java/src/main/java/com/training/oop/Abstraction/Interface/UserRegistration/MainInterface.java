package main.java.com.training.oop.Abstraction.Interface.UserRegistration;

import java.util.Scanner;

public class MainInterface {
    public static void main(String[] args) {
        MainInterface load = new MainInterface();
        load.execute();
    }

    private void execute() {
        System.out.println("********* WELCOME TO OUR SUPER COOL SYSTEM ***********");
        Authentication auth = new UserAuthentication();
        auth.doResigtration();
        auth.doLogin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to continue and other numbers to exit:");
        if (scanner.nextInt() == 1) {
            execute();
        }
    }
}