package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HumanTest {
    private Human human;
    private String[][] boardSetup;

    @BeforeEach
    public void setUp() {
        boardSetup = new String[][]{{"  1  ", "  2  ", "  3  "}, {"  4  ", "  5  ", "  6  "}, {"  7  ", "  8  ", "  9  "}};
        human = new Human(boardSetup);
    }

    @Test
    public void testSetPosition() {
        human.setPosition("1");
        assertEquals("1", human.position);
    }

    @Test
    public void testMove() {
        human.setPosition("1");
        human.move();
        assertEquals("  X  ", boardSetup[0][0]);
    }

    @Test
    public void testOpponentMove() {
        human.setPosition("1");
        human.opponentMove();
        assertEquals("  O  ", boardSetup[0][0]);
    }
}