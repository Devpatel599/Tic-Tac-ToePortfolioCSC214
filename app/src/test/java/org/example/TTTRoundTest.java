package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TTTRoundTest {

    private String[][] board;

    @BeforeEach
    public void setUp() {
        board = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
    }

    @Test
    public void testComputerTurn() {
        TTTRound.computerTurn(board);
        boolean moveMade = false;

        for (String[] row : board) {
            for (String cell : row) {
                if (cell.equals("  O  ")) {
                    moveMade = true;
                    break;
                }
            }
        }

        assertTrue(moveMade);
    }

    @Test
    public void testPlayerTurn() {
        Scanner scanner = new Scanner("1\n");
        TTTRound.playerTurn(board, scanner);
        assertEquals("  X  ", board[0][0]);
    }
}