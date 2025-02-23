package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovementTest {

    @Test
    public void testIsValidMove() {
        String[][] board = {{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};

        assertTrue(Movement.isValidMove(board, "1"));
        assertFalse(Movement.isValidMove(board, "10"));
    }

    @Test
    public void testPlaceMove() {
        String[][] board = {{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};

        Movement.placeMove(board, "1", "  X  ");
        assertEquals("  X  ", board[0][0]);

        Movement.placeMove(board, "5", "  O  ");
        assertEquals("  O  ", board[1][1]);
    }
}