package com.example.divination;

import java.util.List;

public class Model {

    private StringMethod stringMethod;

    private Dice diceMethod;
    private Coin coinMethod;
    private TwoCoin twoCoinMethod;
    private TwoCoinDirect twoCoinDirectMethod;
    private TwoCoinTime twoCoinTimeMethod;

    private String exception;

    /**
     * getter for exception Strings
     *
     * @return the exception message stored to "exception" variable.
     */
    public String getException() {
        return exception;
    }

    /**
     * constructor for model
     */
    public Model() {
        stringMethod = StringMethod.getInstance();
        diceMethod = new Dice();
        coinMethod = new Coin();
        twoCoinMethod = new TwoCoin();
        twoCoinDirectMethod = new TwoCoinDirect();
        twoCoinTimeMethod = new TwoCoinTime();
    }

    /**
     * method for doing String interpretation
     *
     * @param userInput the String that the user typed in to the text field.
     * @return a List of two Hexagram where index-0 refers to the original Hexagram,
     * <p> and index-1 refers to the Future Hexagram
     */
    public List<Hexagram> doString(String userInput) {
        try {
            List<Integer> number = stringMethod.parseInput(userInput);
            return stringMethod.findResult(number.get(0), number.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }
    public List<Hexagram> doCoin() {
        try {
            List<Integer> number = coinMethod.parseInput(null);
            return coinMethod.findResult(number.get(0), number.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }
    public List<Hexagram> doDice() {
        try {
            List<Integer> number = diceMethod.parseInput(null);
            return diceMethod.findResult(number.get(0), number.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }
    public List<Hexagram> doTwoCoin() {
        try {
            List<Integer> numbers = twoCoinMethod.parseInput(null);
            return twoCoinMethod.findResult(numbers.get(0), numbers.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }

    public List<Hexagram> doTwoCoinTime() {
        try {
            List<Integer> numbers = twoCoinTimeMethod.parseInput(null);
            return twoCoinTimeMethod.findResult(numbers.get(0), numbers.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }

    public List<Hexagram> doTwoCoinDirect() {
        try {
            List<Integer> numbers = twoCoinDirectMethod.parseInput(null);
//            System.out.println(numbers);
            return twoCoinDirectMethod.findResult(numbers.get(0), numbers.get(1));
        } catch (IllegalArgumentException e) {
            exception = e.getMessage();
        }
        return null;
    }
}
