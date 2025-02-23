package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GameUI gameUI = new GameUI();
        GameUI.printBoard(gameUI.getBoard());
        while (true) {
            TTTRound.playerTurn(gameUI.getBoard(), scanner);
            if (CheckGame.isGameFinished(gameUI.getBoard())) {
                break;
            }
            GameUI.printBoard(gameUI.getBoard());
            TTTRound.computerTurn(gameUI.getBoard());
            if (CheckGame.isGameFinished(gameUI.getBoard())) {
                break;
            }
            GameUI.printBoard(gameUI.getBoard());
        }
        scanner.close();
    }

}