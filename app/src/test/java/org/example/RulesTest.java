package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RulesTest {
    private String[][] boardSetup;

    @BeforeEach
    public void setUp() {
        boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
    }

    @Test
    public void testIsGameFinished() {
        boardSetup[0][0] = "  X  ";
        boardSetup[0][1] = "  X  ";
        boardSetup[0][2] = "  X  ";
        assertTrue(Rules.isGameFinished(boardSetup));
    }

    @Test
    public void testHasContestantWon() {
        boardSetup[0][0] = "  X  ";
        boardSetup[0][1] = "  X  ";
        boardSetup[0][2] = "  X  ";
        assertTrue(Rules.hasContestantWon(boardSetup, "  X  "));
    }
}