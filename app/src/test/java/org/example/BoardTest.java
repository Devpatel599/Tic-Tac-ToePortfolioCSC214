package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    public void testBoardInitialization() {
        String[][] boardSetup = {{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        Rules rules = new Rules(boardSetup);
        Board board = new Board(rules, boardSetup);

        assertNotNull(board);
        assertArrayEquals(boardSetup, board.board);
    }

    @Test
    public void testPrintBoard() {
        String[][] boardSetup = {{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        Board.printBoard(boardSetup);
        // This test is more about ensuring the method runs without exceptions
        assertTrue(true);
    }
}