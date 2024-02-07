package com.example.divination;

import java.util.List;


/**
 * This class represents a divination method using a coin.
 * It extends the {@link Divination} class and implements coin-based divination.
 */
public class Coin extends Divination {
    /**
     * Generates a random coin result (0 or 1) and returns it as a list of two identical values.
     *
     * @param obj This parameter is not used in this implementation.
     * @return A list containing two identical random coin results (0 or 1).
     */
    @Override
    public List<Integer> parseInput(Object obj) {
        int coinResult = (int) (Math.random() * 2);
        return List.of(coinResult, coinResult);
    }
    /**
     * Uses the results of two coin flips to find a divination result.
     * This method delegates the result calculation to the parent {@link Divination} class.
     *
     * @param upper The result of the first coin flip.
     * @param lower The result of the second coin flip.
     * @return The divination results based on the coin flips.
     * @see Divination#findResult(int, int)
     */
    @Override
    public List<Hexagram> findResult(int upper, int lower) {
        return super.findResult(upper, lower);
    }

}