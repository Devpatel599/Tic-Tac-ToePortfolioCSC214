package org.example;

import java.util.Objects;

public class Movement {
    public static boolean isValidMove(String[][] board, String position) {
        return switch (position) {
            case "1" -> (Objects.equals(board[0][0], "  1  "));
            case "2" -> (Objects.equals(board[0][1], "  2  "));
            case "3" -> (Objects.equals(board[0][2], "  3  "));
            case "4" -> (Objects.equals(board[1][0], "  4  "));
            case "5" -> (Objects.equals(board[1][1], "  5  "));
            case "6" -> (Objects.equals(board[1][2], "  6  "));
            case "7" -> (Objects.equals(board[2][0], "  7  "));
            case "8" -> (Objects.equals(board[2][1], "  8  "));
            case "9" -> (Objects.equals(board[2][2], "  9  "));
            default -> false;
        };
    }


    public static void placeMove(String[][] board, String position, String symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }
}
