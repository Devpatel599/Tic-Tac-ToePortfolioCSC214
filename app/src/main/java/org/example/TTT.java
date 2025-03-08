package org.example;


public class TTT {
    Board board;
    Player player1;
    Player player2;
    Rules rules;
    String[][] currentBoard;

    public TTT(Board inBoard, Player inPlayer1, Player inPlayer2, Rules inRules, String[][] boardSetup) {
        board = inBoard;
        player1 = inPlayer1;
        player2 = inPlayer2;
        rules = inRules;
        currentBoard = boardSetup;
    }

    public void startGame() {
        System.out.println("Welcome!\nI Hope You Have Lots of Fun Playing Tic-Tac-Toe!\n");
        board.printBoard(currentBoard);
        while (true) {
            player1.move();
            if (rules.isGameFinished(currentBoard)) {
                break;
            }
            board.printBoard(currentBoard);
            player2.move();
            if (rules.isGameFinished(currentBoard)) {
                break;
            }
            board.printBoard(currentBoard);
        }
    }

}
