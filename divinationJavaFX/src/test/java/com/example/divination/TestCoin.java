package com.example.divination;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCoin {

        private Coin coin;

        @BeforeEach
        void setUp() {
            coin = new Coin();
        }

        @Test
        void testParseInput() {
            List<Integer> result = coin.parseInput(null);
            assertEquals(2, result.size());
            for (int value : result) {
                assertEquals(0, value); // Since the result of the coin flip should be 0 or 1
            }
        }

        @Test
        void testFindResult() {
            int upper = 0; // Simulating the result of a coin flip
            int lower = 0; // Simulating the result of a coin flip

            List<Hexagram> result = coin.findResult(upper, lower);

            assertEquals(2, result.size());
            assertEquals('䷀', result.get(0).getHexagram());
            assertEquals("Ch'ien / The Creative", result.get(0).getDefinition());
            assertEquals('䷁', result.get(1).getHexagram());
            assertEquals("K'un / The Receptive", result.get(1).getDefinition());
        }
    }
