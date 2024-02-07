package com.example.divination;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class TestTwoCoinTime {

    @Test
    void testFindResult() {
        TwoCoinTime divination = new TwoCoinTime();

        // Test case 1: Changing line is 0
        List<Hexagram> result1 = divination.findResult(0, 0);
        assertEquals("K'un / The Receptive", result1.get(0).getDefinition());
        assertEquals("Ch'ien / The Creative", result1.get(1).getDefinition());

        // Test case 2: Changing line is not 0
        List<Hexagram> result2 = divination.findResult(1, 0);
        assertEquals("T'ai / Peace", result2.get(0).getDefinition());
        // The hexagram for this specific case needs to be determined based on the input and current time
        assertNotNull(result2.get(1));
    }

    @Test
    void testParseInput() {
        TwoCoinTime divination = new TwoCoinTime();

        List<Integer> coinResults = divination.parseInput(null);
        assertEquals(2, coinResults.size());

        for (int coinResult : coinResults) {
            assertTrue(coinResult == 0 || coinResult == 1);
        }
    }

}
