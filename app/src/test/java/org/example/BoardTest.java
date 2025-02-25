package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
    private Board board;
    private String[][] boardSetup;

    @BeforeEach
    void setUp() {
        boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        board = new Board(boardSetup);
    }

    @Test
    void testPrintBoard() {
        assertDoesNotThrow(() -> board.printBoard(boardSetup));
    }
}