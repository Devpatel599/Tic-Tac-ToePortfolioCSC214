package org.example;

import java.util.Objects;

public class Rules {
    String[][] layoutBoard;
    Board board;

    public Rules(String[][] inBoardLayout, Board inBoard) {
        layoutBoard = inBoardLayout;
        board = inBoard;
    }

    public boolean isGameFinished(String[][] layoutBoard) {

        if (hasContestantWon(layoutBoard, "  X  ")) {
            board.printBoard(layoutBoard);
            System.out.println("Player 1 wins!");
            return true;
        }

        if (hasContestantWon(layoutBoard, "  O  ")) {
            board.printBoard(layoutBoard);
            System.out.println("Player 2 wins!");
            return true;
        }

        for (String[] row : layoutBoard) {
            for (String cell : row) {
                if (!cell.equals("  X  ") && !cell.equals("  O  ")) {
                    return false;
                }
            }
        }

        board.printBoard(layoutBoard);
        System.out.println("The game ended in a tie!");
        return true;
    }


    public boolean hasContestantWon(String[][] board, String symbol) {
        return (Objects.equals(board[0][0], symbol) && Objects.equals(board[0][1], symbol) && Objects.equals(board[0][2], symbol)) || (Objects.equals(board[1][0], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[1][2], symbol)) || (Objects.equals(board[2][0], symbol) && Objects.equals(board[2][1], symbol) && Objects.equals(board[2][2], symbol)) ||

                (Objects.equals(board[0][0], symbol) && Objects.equals(board[1][0], symbol) && Objects.equals(board[2][0], symbol)) || (Objects.equals(board[0][1], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][1], symbol)) || (Objects.equals(board[0][2], symbol) && Objects.equals(board[1][2], symbol) && Objects.equals(board[2][2], symbol)) ||

                (Objects.equals(board[0][0], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][2], symbol)) || (Objects.equals(board[0][2], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][0], symbol));
    }
}
