package org.example;

import java.util.Objects;
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
            inputPosition();
            player.move();
            if (Rules.isGameFinished(currentBoard)) {
                break;
            }
            board.printBoard(currentBoard);
            inputPosition();
            player.opponentMove();
            if (Rules.isGameFinished((currentBoard))) {
                break;
            }
            Board.printBoard(currentBoard);
        }
        scanner.close();
    }

    public void inputPosition() {
        String position;
        boolean valid;
        while (true) {
            System.out.println("Where would you like to play? (1-9)");
            position = scanner.nextLine();


            valid = switch (position) {
                case "1" -> (Objects.equals(currentBoard[0][0], "  1  "));
                case "2" -> (Objects.equals(currentBoard[0][1], "  2  "));
                case "3" -> (Objects.equals(currentBoard[0][2], "  3  "));
                case "4" -> (Objects.equals(currentBoard[1][0], "  4  "));
                case "5" -> (Objects.equals(currentBoard[1][1], "  5  "));
                case "6" -> (Objects.equals(currentBoard[1][2], "  6  "));
                case "7" -> (Objects.equals(currentBoard[2][0], "  7  "));
                case "8" -> (Objects.equals(currentBoard[2][1], "  8  "));
                case "9" -> (Objects.equals(currentBoard[2][2], "  9  "));
                default -> false;
            };
            if (valid) {
                break;
            } else {
                System.out.println(position + " is not a valid move.");
                board.printBoard(currentBoard);

            }
        }
        player.setPosition(position);
    }
}
