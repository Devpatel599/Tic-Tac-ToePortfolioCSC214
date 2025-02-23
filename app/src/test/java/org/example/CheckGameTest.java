package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckGameTest {

    @Test
    public void testIsGameFinished() {
        String[][] board = {{"  X  ", "  X  ", "  X  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};

        assertTrue(CheckGame.isGameFinished(board));

        board[0][0] = "  X  ";
        board[0][1] = "  2  ";
        board[0][2] = "  3  ";

        assertFalse(CheckGame.isGameFinished(board));
    }

    @Test
    public void testHasContestantWon() {
        String[][] board = {{"  X  ", "  X  ", "  X  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};

        assertTrue(CheckGame.hasContestantWon(board, "  X  "));
        assertFalse(CheckGame.hasContestantWon(board, "  O  "));
    }
}