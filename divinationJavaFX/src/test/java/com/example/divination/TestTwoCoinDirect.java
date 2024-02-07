package com.example.divination;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestTwoCoinDirect {

    @Test
    void testFindResult() {
        TwoCoinDirect divination = new TwoCoinDirect();

        // Test case 1: Changing line is 0
        List<Hexagram> result1 = divination.findResult(0, 0);
        assertEquals("K'un / The Receptive", result1.get(0).getDefinition());
        assertEquals("Ch'ien / The Creative", result1.get(1).getDefinition());

        // Test case 2: Changing line is not 0
        List<Hexagram> result2 = divination.findResult(1, 0);
        assertEquals("K'un / The Receptive", result2.get(1).getDefinition());
        assertEquals("T'ai / Peace", result2.get(0).getDefinition());
    }

    @Test
    void testParseInput() {
        TwoCoinDirect divination = new TwoCoinDirect();

        List<Integer> coinResults = divination.parseInput(null);
        assertEquals(2, coinResults.size());

        for (int coinResult : coinResults) {
            assertTrue(coinResult == 0 || coinResult == 1);
        }
    }
}