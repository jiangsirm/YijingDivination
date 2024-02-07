package com.example.divination;

import java.util.List;
import java.util.Random;
/**
 * This class represents a divination method using dice.
 * It extends the {@link Divination} class and implements dice-based divination.
 */
    public class Dice extends Divination {
    /**
     * Generates two random dice roll results (between 1 and 6) and returns them as a list.
     *
     * @param obj This parameter is not used in this implementation.
     * @return A list containing two random dice roll results.
     */
        @Override
        public List<Integer> parseInput(Object obj) {
            Random random = new Random();
            int upper = random.nextInt(6) + 1;
            int lower = random.nextInt(6) + 1;
            return List.of(upper, lower);
        }
    /**
     * Uses the results of two dice rolls to find a divination result.
     * This method delegates the result calculation to the parent {@link Divination} class.
     *
     * @param upper The result of the first dice roll.
     * @param lower The result of the second dice roll.
     * @return The divination results based on the dice rolls.
     * @see Divination#findResult(int, int)
     */
        @Override
        public List<Hexagram> findResult(int upper, int lower) {
            return super.findResult(upper, lower);
        }

    }
