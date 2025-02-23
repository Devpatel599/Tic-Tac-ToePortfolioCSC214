package org.example;

import java.util.Random;
import java.util.Scanner;

public class TTTRound extends Movement {
    public static void computerTurn(String[][] board) {
        Random rand = new Random();
        int computerMove;
        do {
            computerMove = rand.nextInt(9) + 1;
        } while (!isValidMove(board, Integer.toString(computerMove)));
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), "  O  ");
    }

    public static void playerTurn(String[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Where would you like to play? (1-9)");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, "  X  ");
    }
}
