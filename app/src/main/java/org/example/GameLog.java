package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GameLog {
    private int xWins = 0;
    private int oWins = 0;
    private int ties = 0;

    public void recordWin(String symbol) {
        if (symbol.equals("  X  ")) xWins++;
        else if (symbol.equals("  O  ")) oWins++;
    }

    public void recordTie() {
        ties++;
    }

    public void displayLog() {
        System.out.println("\nCurrent Game Log:");
        System.out.println("Player X Wins: " + xWins);
        System.out.println("Player O Wins: " + oWins);
        System.out.println("Ties: " + ties + "\n");
    }

    public void saveToFile() {
        try (PrintWriter out = new PrintWriter(new FileWriter("game.txt"))) {
            out.println("Final Game Log:");
            out.println("---------------");
            out.println("Player X Wins: " + xWins);
            out.println("Player O Wins: " + oWins);
            out.println("Ties: " + ties);
            out.println("Thanks for playing!");
        } catch (IOException e) {
            System.out.println("Error saving game log: " + e.getMessage());
        }
    }
}
