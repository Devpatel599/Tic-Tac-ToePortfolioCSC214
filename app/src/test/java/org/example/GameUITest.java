package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameUITest {

    @Test
    public void testGetBoard() {
        GameUI gameUI = new GameUI();
        String[][] board = gameUI.getBoard();

        assertNotNull(board);
        assertEquals(3, board.length);
        assertEquals(3, board[0].length);
    }

    @Test
    public void testPrintBoard() {
        String[][] board = {{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};

        GameUI.printBoard(board);
    }
}