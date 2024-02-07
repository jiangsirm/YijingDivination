package com.example.divination;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * class for String method as a Singleton
 */
public class StringMethod extends Divination {

    /**
     * constant for maximum input String length
     */
    private static final int CHAR_LIMIT = 200;

    /**
     * StringMethod instance
     */
    private static StringMethod instance;

    /**
     * private constructor for String method
     */
    private StringMethod() {
    }

    /**
     * get the instance of the method
     *
     * @return the StringMethod instance
     */
    public static StringMethod getInstance() {
        if (instance == null) {
            instance = new StringMethod();
        }
        return instance;
    }

    /**
     * HashMap that map each english character to Integer for number of strokes it contains.
     */
    public static final HashMap<Character, Integer> STROKES = new HashMap<>();

    static {
        STROKES.put('A', 3);
        STROKES.put('B', 3);
        STROKES.put('C', 1);
        STROKES.put('D', 2);
        STROKES.put('E', 4);
        STROKES.put('F', 3);
        STROKES.put('G', 2);
        STROKES.put('H', 3);
        STROKES.put('I', 3);
        STROKES.put('J', 3);
        STROKES.put('K', 3);
        STROKES.put('L', 3);
        STROKES.put('M', 2);
        STROKES.put('N', 2);
        STROKES.put('O', 1);
        STROKES.put('P', 2);
        STROKES.put('Q', 2);
        STROKES.put('R', 2);
        STROKES.put('S', 1);
        STROKES.put('T', 2);
        STROKES.put('U', 1);
        STROKES.put('V', 1);
        STROKES.put('W', 1);
        STROKES.put('X', 2);
        STROKES.put('Y', 2);
        STROKES.put('Z', 1);

        STROKES.put('a', 1);
        STROKES.put('b', 1);
        STROKES.put('c', 1);
        STROKES.put('d', 1);
        STROKES.put('e', 1);
        STROKES.put('f', 2);
        STROKES.put('g', 1);
        STROKES.put('h', 1);
        STROKES.put('i', 2);
        STROKES.put('j', 2);
        STROKES.put('k', 2);
        STROKES.put('l', 1);
        STROKES.put('m', 1);
        STROKES.put('n', 1);
        STROKES.put('o', 1);
        STROKES.put('p', 1);
        STROKES.put('q', 1);
        STROKES.put('r', 1);
        STROKES.put('s', 1);
        STROKES.put('t', 2);
        STROKES.put('u', 1);
        STROKES.put('v', 1);
        STROKES.put('w', 1);
        STROKES.put('x', 2);
        STROKES.put('y', 2);
        STROKES.put('z', 1);
    }

    /**
     * method for parsing String input into a list of two integers
     *
     * @param obj the input to be passed in
     * @return List contain two Integers
     * <p> 0-index for the upper number
     * <p> 1-index for the lower number
     * @throws IllegalArgumentException throw exceptions if the input is not valid
     */
    @Override
    public List<Integer> parseInput(Object obj) throws IllegalArgumentException {
        if (!(obj instanceof String)) throw new IllegalArgumentException("Input must be a String");
        String in = (String) obj;

        if (in.isBlank()) throw new IllegalArgumentException("Input should not be blank");
        if (in.length() >= CHAR_LIMIT) throw new IllegalArgumentException("Length of the input should not exceed " + CHAR_LIMIT + " characters");
        if (in.matches(".*[^a-zA-Z\\s]+.*"))
            throw new IllegalArgumentException("Input should contain only english characters!");

        String[] sample = in.split("\\s+");

        if (sample.length == 1) {
            String word = sample[0];
            if (word.length() == 1) throw new IllegalArgumentException("Input must be longer than one character");
            String upperHalf = word.substring(0, word.length() / 2);
            String lowerHalf = word.substring(word.length() / 2);
            Integer upper = upperHalf.chars().map(c -> STROKES.get((char) c)).sum();
            Integer lower = lowerHalf.chars().map(c -> STROKES.get((char) c)).sum();
            if (word.length() % 2 == 0 && upper > lower) {
                return List.of(lower, upper);
            }
            return List.of(upper, lower);
        } else {
            Integer upper = Arrays.stream(sample, 0, sample.length / 2)
                    .mapToInt(s -> s.chars().map(c -> STROKES.get((char) c)).sum())
                    .sum();
            Integer lower = Arrays.stream(sample, sample.length / 2, sample.length)
                    .mapToInt(s -> s.chars().map(c -> STROKES.get((char) c)).sum())
                    .sum();
            if (sample.length % 2 == 0 && upper > lower) {
                return List.of(lower, upper);
            }
            return List.of(upper, lower);
        }
    }
}
