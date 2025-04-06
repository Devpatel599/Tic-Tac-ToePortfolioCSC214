package org.example;

import java.util.Scanner;

public class TTT {
    Board board;
    Player playerX;
    Player playerO;
    Rules rules;
    String[][] currentBoard;
    GameLog gameLog;
    Scanner scanner = new Scanner(System.in);

    public TTT(Board inBoard, Player inPlayerX, Player inPlayerO, Rules inRules, String[][] boardSetup) {
        board = inBoard;
        playerX = inPlayerX;
        playerO = inPlayerO;
        rules = inRules;
        currentBoard = boardSetup;
        gameLog = new GameLog();
    }

    public void startGame() {
        String starter = "X"; // X always starts first
        boolean keepPlaying = true;

        while (keepPlaying) {
            resetBoard();
            System.out.println("\nNew Game! " + (starter.equals("X") ? "X" : "O") + " will go first!");
            board.printBoard(currentBoard);

            String winner = playRound(starter);
            if (winner.equals("X")) {
                gameLog.recordWin("  X  ");
                starter = "O"; // loser starts next
            } else if (winner.equals("O")) {
                gameLog.recordWin("  O  ");
                starter = "X";
            } else {
                gameLog.recordTie();
                // Starter remains same on tie
            }

            gameLog.displayLog();

            System.out.println("Would you like to play again? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                keepPlaying = false;
                gameLog.saveToFile();
                System.out.println("Game log saved to game.txt. Goodbye!");
            }
        }
    }

    private String playRound(String starter) {
        Player first = starter.equals("X") ? playerX : playerO;
        Player second = starter.equals("X") ? playerO : playerX;

        while (true) {
            first.move();
            if (rules.isGameFinished(currentBoard)) {
                return rules.getWinnerSymbol(currentBoard);
            }
            board.printBoard(currentBoard);

            second.move();
            if (rules.isGameFinished(currentBoard)) {
                return rules.getWinnerSymbol(currentBoard);
            }
            board.printBoard(currentBoard);
        }
    }

    private void resetBoard() {
        int num = 1;
        for (int i = 0; i < currentBoard.length; i++) {
            for (int j = 0; j < currentBoard[i].length; j++) {
                currentBoard[i][j] = String.format("  %d  ", num++);
            }
        }
    }
}
