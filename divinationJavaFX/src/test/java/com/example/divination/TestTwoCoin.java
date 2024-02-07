package com.example.divination;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwoCoin {

    private TwoCoin twoCoin;

    @BeforeEach
    void setUp() {
        twoCoin = new TwoCoin();
    }

    @Test
    void testParseInput() {
        List<Integer> result = twoCoin.parseInput(null);
        assertEquals(2, result.size());
        for (int value : result) {
            assertEquals(0, value);
        }
    }

    @Test
    void testFindResult() {
        int upper = 0;
        int lower = 0;

        List<Hexagram> result = twoCoin.findResult(upper, lower);

        assertEquals(2, result.size());
        assertEquals('䷀', result.get(0).getHexagram());
        assertEquals("Ch'ien / The Creative", result.get(0).getDefinition());
        assertEquals('䷁', result.get(1).getHexagram());
        assertEquals("K'un / The Receptive", result.get(1).getDefinition());
    }
}