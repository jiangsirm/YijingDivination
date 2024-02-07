package com.example.divination;

import java.time.LocalTime;
import java.util.List;

/**
 * abstract class for Divination
 */
public abstract class Divination {

    /**
     * Enter the upper and lower numbers and the number for changeLine
     * <p> changeLine is calculated by add upper + lower + current shi chen.
     *
     * @param upper      the number for upper trigram
     * @param lower      the number for lower trigram
     * @param changeLine the number calculated for changing line
     * @return a Hexagram that is resulted from changing the line
     */
    public Hexagram findPair(int upper, int lower, int changeLine) {
        int toChange = upper % 8;
        boolean isUpper = true;
        if (changeLine >= 1 && changeLine <= 3) {
            toChange = lower % 8;
            isUpper = false;
        }
        changeLine = changeLine % 3;
        switch (toChange) {
            case 0:
                if (changeLine == 0) {
                    toChange = 7;
                } else if (changeLine == 1) {
                    toChange = 4;
                } else {
                    toChange = 6;
                }
                break;
            case 1:
                if (changeLine == 0) {
                    toChange = 2;
                } else if (changeLine == 1) {
                    toChange = 5;
                } else {
                    toChange = 3;
                }
                break;
            case 2:
                if (changeLine == 0) {
                    toChange = 1;
                } else if (changeLine == 1) {
                    toChange = 6;
                } else {
                    toChange = 4;
                }
                break;
            case 3:
                if (changeLine == 0) {
                    toChange = 4;
                } else if (changeLine == 1) {
                    toChange = 7;
                } else {
                    toChange = 1;
                }
                break;
            case 4:
                if (changeLine == 0) {
                    toChange = 3;
                } else if (changeLine == 1) {
                    toChange = 0;
                } else {
                    toChange = 2;
                }
                break;
            case 5:
                if (changeLine == 0) {
                    toChange = 6;
                } else if (changeLine == 1) {
                    toChange = 1;
                } else {
                    toChange = 7;
                }
                break;
            case 6:
                if (changeLine == 0) {
                    toChange = 5;
                } else if (changeLine == 1) {
                    toChange = 2;
                } else {
                    toChange = 0;
                }
                break;
            case 7:
                if (changeLine == 0) {
                    toChange = 0;
                } else if (changeLine == 1) {
                    toChange = 3;
                } else {
                    toChange = 5;
                }
                break;
        }
        if (isUpper) {
            upper = toChange;
        } else {
            lower = toChange;
        }

        return Yijing.YI_JING.get(upper % 8 + "" + lower % 8);
    }

    /**
     * entering a number for upper trigram and a lower trigram
     * <p> to find a pair of hexagrams
     *
     * @param upper the number for upper trigram
     * @param lower the number for lower trigram
     * @return a List<Hexgram> object containing two elements
     * <p> index-0 element is the original hexagram, and
     * <p> index-1 element is the future hexagram.
     */
    public List<Hexagram> findResult(int upper, int lower) {
        Hexagram result1 = Yijing.YI_JING.get(upper % 8 + "" + lower % 8);
        int shiChen = ((LocalTime.now().getHour() + 1) % 24) / 2 + 1;
        int changingLine = (upper + lower + shiChen) % 6;
        Hexagram result2 = findPair(upper, lower, changingLine);
        return List.of(result1, result2);
    }

    /**
     * the method use to take whatever input and then
     * <p>convert the input into two number for upper and lower trigram
     * <p>index-0 element of the result list would be the number for upper trigram
     * <p>index-1 element of the result list would be the number for lower trigram
     *
     * @param obj the input to be passed in
     * @return a list containing exactly two Integers.
     */
    public abstract List<Integer> parseInput(Object obj);
}
