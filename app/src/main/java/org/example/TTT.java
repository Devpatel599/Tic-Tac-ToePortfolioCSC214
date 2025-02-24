package org.example;

import java.util.Scanner;

public class TTT {
    Board board;
    Player player;
    Rules rules;
    String[][] currentBoard;
    Scanner scanner = new Scanner(System.in);

    public TTT(Board inBoard, Player inPlayer, Rules inRules, String[][] boardSetup) {
        board = inBoard;
        player = inPlayer;
        rules = inRules;
        currentBoard = boardSetup;
    }

    public void startGame() {
        board.printBoard(currentBoard);
        while (true) {
            player.move();
            if (Rules.isGameFinished(currentBoard)) {
                break;
            }
            Board.printBoard(currentBoard);
            player.opponentMove();
            if (Rules.isGameFinished((currentBoard))) {
                break;
            }
            Board.printBoard(currentBoard);
        }
        scanner.close();
    }
}
