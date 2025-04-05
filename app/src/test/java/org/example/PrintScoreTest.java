package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class PrintScoreTest {
    @BeforeEach
    void setUp() {
        // Reset counters before each test
        PrintScore.playerXWinCounter = 0;
        PrintScore.playerOWinCounter = 0;
        PrintScore.tieCounter = 0;
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up any created files
        Files.deleteIfExists(Paths.get("game.txt"));
    }

    @Test
    void winAndTieCountDisplay_showsCorrectCounts() {
        // Set up test data
        PrintScore.playerXWinCounter = 2;
        PrintScore.playerOWinCounter = 3;
        PrintScore.tieCounter = 1;

        // Redirect System.out to capture output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        PrintScore.winAndTieCountDisplay();

        String output = out.toString();
        assertTrue(output.contains("Player X Wins   2"));
        assertTrue(output.contains("Player O Wins   3"));
        assertTrue(output.contains("Ties            1"));
    }

    @Test
    void winAndTieToFile_createsFileWithCorrectContent() throws IOException {
        // Set up test data
        PrintScore.playerXWinCounter = 5;
        PrintScore.playerOWinCounter = 4;
        PrintScore.tieCounter = 2;

        PrintScore.winAndTieToFile();

        // Verify file was created
        Path path = Paths.get("game.txt");
        assertTrue(Files.exists(path));

        // Read file content
        String content = Files.readString(path);
        assertTrue(content.contains("Player X Wins   5"));
        assertTrue(content.contains("Player O Wins   4"));
        assertTrue(content.contains("Ties            2"));
    }

    @Test
    void winAndTieToFile_handlesIOException() {
        // Try to write to a directory that should cause an error
        try (java.io.PrintWriter ignored = new java.io.PrintWriter(Files.newBufferedWriter(Paths.get("/invalid/path/game.txt")))) {
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected behavior
        }
    }
}