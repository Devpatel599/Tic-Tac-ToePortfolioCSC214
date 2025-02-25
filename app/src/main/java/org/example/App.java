package org.example;

public class App {

    public static void main(String[] args) {
        String[][] boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        Board board = new Board(boardSetup);
        Rules rules = new Rules(boardSetup, board);
        Player player1 = new Human(boardSetup, "  X  ");
        Player player2 = new Human(boardSetup, "  O  ");
        TTT ttt = new TTT(board, player1, player2, rules, boardSetup);
        ttt.startGame();
    }

}