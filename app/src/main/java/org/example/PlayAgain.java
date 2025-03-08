package org.example;

import java.util.Scanner;

public class PlayAgain {

    public static boolean checkYesNo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter 'yes' or 'no': ");
            String userInput = scanner.nextLine().trim().toLowerCase();
            if (userInput.equals("yes")) {
                return true;
            } else if (userInput.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}
