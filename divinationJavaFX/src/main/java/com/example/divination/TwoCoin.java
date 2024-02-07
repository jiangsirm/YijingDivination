package com.example.divination;

import java.util.Collections;
import java.util.List;
/**
 * This class represents a divination method using two coin flips.
 * It extends the {@link Divination} class and implements divination using two coin flips.
 */
public class TwoCoin extends Divination{
    /**
     * Generates two random coin flip results (0 or 1) and returns them as a list.
     *
     * @param obj This parameter is not used in this implementation.
     * @return A list containing two random coin flip results.
     */
    public List<Integer> parseInput(Object obj) {
        int coinResult1 = (int) (Math.random() * 2);
        int coinResult2 = (int) (Math.random() * 2);
        return List.of(coinResult1, coinResult2);
    }
    /**
     * Uses the results of two coin flips to find a divination result.
     * This method calculates a changing line based on the sum of the two coin flip results.
     * The upper and lower trigrams are determined by the changing line results.
     *
     * @param upper The result of the first coin flip.
     * @param lower The result of the second coin flip.
     * @return The divination results based on the coin flips.
     * @see Divination#findResult(int, int)
     */
    @Override
    public List<Hexagram> findResult(int upper, int lower) {
        int coinResult1 = (int) (Math.random() * 2);
        int coinResult2 = (int) (Math.random() * 2);

        int changeLine = coinResult1 + coinResult2;

        int upperTrigram = changeLine % 2;
        int lowerTrigram = (changeLine + 1) % 2;

        return super.findResult(upperTrigram, lowerTrigram);
    }
}

