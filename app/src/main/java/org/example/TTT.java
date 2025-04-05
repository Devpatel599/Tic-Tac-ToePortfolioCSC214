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
        board.printBoard(currentBoard);
        while (true) {
            if(Rules.playerXPlaysNext) {
                player1.move();
                Rules.playerXPlaysNext = false;
                if (rules.isGameFinished(currentBoard)) {
                    break;
                }
                board.printBoard(currentBoard);
            }
            if(!Rules.playerXPlaysNext) {
                player2.move();
                Rules.playerXPlaysNext = true;
                if (rules.isGameFinished(currentBoard)) {
                    break;
                }
                board.printBoard(currentBoard);
            }
        }
    }

}
