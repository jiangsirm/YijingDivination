package com.example.divination;

import java.time.LocalTime;
import java.util.List;
/**
 * This class represents a divination method using two coin flips with time-based calculations.
 * It extends the {@link Divination} class and implements divination using two coin flips with time-based calculations.
 */
public class TwoCoinTime extends Divination {
    /**
     * Generates two random coin flip results (0 or 1) and returns them as a list.
     *
     * @param obj This parameter is not used in this implementation.
     * @return A list containing two random coin flip results.
     */
    @Override
    public List<Integer> parseInput(Object obj) {
        int coinResult1 = (int) (Math.random() * 2);
        int coinResult2 = (int) (Math.random() * 2);
        return List.of(coinResult1, coinResult2);
    }
    /**
     * Uses the results of two coin flips and the current time to find a divination result.
     * This method calculates the Shichen (time period) based on the current hour and derives a changing line.
     * It then calculates new coin flip results based on the changing line and retrieves corresponding hexagrams
     * from the Yijing dictionary using generated keys.
     *
     * @param upper The result of the first coin flip.
     * @param lower The result of the second coin flip.
     * @return The divination results based on the coin flips and time-based calculations.
     * @see Divination#findResult(int, int)
     * @see Yijing#YI_JING
     */
    @Override
    public List<Hexagram> findResult(int upper, int lower) {
        int shiChen = ((LocalTime.now().getHour() + 1) % 24) / 2 + 1;
        int changingLine = (upper + lower + shiChen) % 6;

        String key1 = String.format("%d%d", upper, lower);

        int upper2 = (upper + changingLine) % 8;
        int lower2 = (lower + changingLine) % 8;
        String key2 = String.format("%d%d", upper2, lower2);

        Hexagram result2 = Yijing.YI_JING.get(key2);

        return List.of(Yijing.YI_JING.get(key1), result2);
    }
}

//In this implementation, the findResult method takes the upper and lower
// coin results as input and calculates a changing line based on the hour of
// the day. uses
// the findPair method to generate the future hexagram based on the upper and lower
// coin results and the calculated changing line.