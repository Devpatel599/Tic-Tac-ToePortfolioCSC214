package org.example;

import java.util.Objects;

public class Rules {
    String[][] board;

    public Rules(String[][] inBoard) {
        board = inBoard;
    }

    public static boolean isGameFinished(String[][] board) {

        if (hasContestantWon(board, "  X  ")) {
            Board.printBoard(board);
            System.out.println("Player wins!");
            return true;
        }

        if (hasContestantWon(board, "  O  ")) {
            Board.printBoard(board);
            System.out.println("Opponent wins!");
            return true;
        }

        for (String[] row : board) {
            for (String cell : row) {
                if (!cell.equals("  X  ") && !cell.equals("  O  ")) {
                    return false;
                }
            }
        }

        Board.printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }


    public static boolean hasContestantWon(String[][] board, String symbol) {
        return (Objects.equals(board[0][0], symbol) && Objects.equals(board[0][1], symbol) && Objects.equals(board[0][2], symbol)) || (Objects.equals(board[1][0], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[1][2], symbol)) || (Objects.equals(board[2][0], symbol) && Objects.equals(board[2][1], symbol) && Objects.equals(board[2][2], symbol)) ||

                (Objects.equals(board[0][0], symbol) && Objects.equals(board[1][0], symbol) && Objects.equals(board[2][0], symbol)) || (Objects.equals(board[0][1], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][1], symbol)) || (Objects.equals(board[0][2], symbol) && Objects.equals(board[1][2], symbol) && Objects.equals(board[2][2], symbol)) ||

                (Objects.equals(board[0][0], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][2], symbol)) || (Objects.equals(board[0][2], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][0], symbol));
    }
}
