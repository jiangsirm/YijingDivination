package com.example.divination;

import java.util.List;
/**
 * This class represents a divination method using two direct coin flips.
 * It extends the {@link Divination} class and implements divination using two direct coin flips.
 */
public class TwoCoinDirect extends Divination {
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
     * Uses the results of two direct coin flips to find a divination result.
     * This method calculates a sum of the coin flip results and determines a changing line.
     * Based on the changing line, it retrieves corresponding hexagrams from the Yijing dictionary.
     *
     * @param upper The result of the first coin flip.
     * @param lower The result of the second coin flip.
     * @return The divination results based on the direct coin flips.
     * @see Divination#findResult(int, int)
     * @see Yijing#YI_JING
     */
    @Override
    public List<Hexagram> findResult(int upper, int lower) {
        int sum = upper + lower;
        int changingLine = sum % 6;
        Hexagram result2 = findPair(upper, lower, changingLine);

        if (changingLine == 0) {
            Hexagram result1 = Yijing.YI_JING.get(upper % 2 + "" + (sum % 8));
            return List.of(result1, result2);
        } else {
            Hexagram result1 = Yijing.YI_JING.get(lower % 2 + "" + (sum % 8));
            return List.of(result2, result1);
        }
    }
}
//the sum of the upper and lower coin results is calculated, changingLine is determined using the sum modulo 6.
// result2 hexagram is obtained using the findPair method based on the calculated changingLine.
//
//if changing line is 0 IThe method returns a list containing result1 and result2.
//
//If the changingLine is not 0, it calculates the result1 hexagram using the lower coin result and the sum modulo 8.
// The method returns a list containing result2 and result1.