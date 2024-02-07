package com.example.divination;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestModel {

    Model test = new Model();

    @Test
    public void TestGetException() {
        assertNull(test.getException(), "Exception should be null when created");
        test.doString("a");
        assertEquals(test.getException(), "Input must be longer than one character", "Take a single character as input would throw an exception and update the exception variable");
    }

    @Test
    public void TestDoString() {
        List<Hexagram> res = test.doString("Apple");
        List<Hexagram> actualRes = StringMethod.getInstance().findResult(4, 3);
        assertEquals(res, actualRes, "Do string should return a List of Hexagram contain two hexagrams");
    }

}
