package com.example.divination;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringMethod {

    StringMethod test = StringMethod.getInstance();

    @Test
    public void TestSingleton() {
        assertEquals(test, StringMethod.getInstance(), "Singleton Should be only one object");
    }

    @Test
    public void TestSTROKES() {
        assertTrue(test.STROKES.get('a') == 1, "a only takes one Stroke");
        assertTrue(test.STROKES.get('F') == 3, "F takes three Strokes");
    }

    @Test
    public void TestParseInputExceptions() {
        Integer one = 1;
        String blank = "     ";
        String longString = "";
        for (int i = 1000; i > 0; i--) {
            longString += "a";
        }
        String longTest = longString;
        String invalidChar = "!@@@@";
        String oneChar = "a";
        assertThrows(IllegalArgumentException.class, () -> test.parseInput(one), "Pass non-String value into method should throw exception");
        assertThrows(IllegalArgumentException.class, () -> test.parseInput(blank), "Pass blank String value into method should throw exception");
        assertThrows(IllegalArgumentException.class, () -> test.parseInput(longTest), "Pass String longer than 200 into method should throw exception");
        assertThrows(IllegalArgumentException.class, () -> test.parseInput(invalidChar), "Pass string containing invalid character into method should throw exception");
        assertThrows(IllegalArgumentException.class, () -> test.parseInput(oneChar), "Pass string containing only one character into method should throw exception");
    }

    @Test
    public void TestParseInput() {
        List<Integer> inputApple = List.of(4, 3);
        assertEquals(inputApple, test.parseInput("Apple"), "Apple should be parsed to <4, 3>");
        List<Integer> inputTwoWords = List.of(7, 6);
        assertEquals(inputTwoWords, test.parseInput("Apple banana"), "two words must be parsed into two words");
    }

    @Test
    public void TestFindPair() {
        Integer num = 10;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 11;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 12;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 13;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 14;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 15;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 16;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 17;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 18;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 19;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 20;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 21;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 22;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 23;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 24;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
        num = 25;
        assertEquals(test.findResult(num, num), test.findResult(num, num), "Find result for the same input should be the same");
    }
}
