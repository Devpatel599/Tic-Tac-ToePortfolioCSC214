package org.example;

public class App {

    public static void main(String[] args) {
        String[][] boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        Rules rules = new Rules(boardSetup);
        Board board = new Board(rules, boardSetup);
        Player player = new Human(boardSetup);
        TTT ttt = new TTT(board, player, rules, boardSetup);
        ttt.startGame();
    }

}