package com.example.divination;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDice {

    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @Test
    void testParseInput() {
        List<Integer> result = dice.parseInput(null);
        assertEquals(2, result.size());
        for (int value : result) {
            assertEquals(true, value >= 1 && value <= 6);
        }
    }

    @Test
    void testFindResult() {
        int upper = 1;
        int lower = 2;

        List<Hexagram> result = dice.findResult(upper, lower);

        assertEquals(2, result.size());
        assertEquals('䷀', result.get(0).getHexagram());
        assertEquals("Ch'ien / The Creative", result.get(0).getDefinition());
        assertEquals('䷁', result.get(1).getHexagram());
        assertEquals("K'un / The Receptive", result.get(1).getDefinition());
    }
}