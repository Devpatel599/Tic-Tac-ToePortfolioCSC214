package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RulesTest {
    private Rules rules;
    private String[][] boardSetup;

    @BeforeEach
    void setUp() {
        boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        Board board = new Board(boardSetup);
        rules = new Rules(boardSetup, board);
    }

    @Test
    void testIsGameFinished() {
        assertFalse(rules.isGameFinished(boardSetup));
        boardSetup[0][0] = boardSetup[0][1] = boardSetup[0][2] = "  X  ";
        assertTrue(rules.isGameFinished(boardSetup));
    }

    @Test
    void testHasContestantWon() {
        boardSetup[0][0] = boardSetup[0][1] = boardSetup[0][2] = "  X  ";
        assertTrue(rules.hasContestantWon(boardSetup, "  X  "));
    }
}