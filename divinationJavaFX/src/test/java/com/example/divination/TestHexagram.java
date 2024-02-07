package com.example.divination;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHexagram {

    public static Hexagram hexagram = new Hexagram('䷀', "Tianxingjian");

    @Test
    public void constructorTest() {
        char qianHex = '䷀';
        String def = "Tianxingjian";
        char actualResult = hexagram.getHexagram();
        String actualRes = hexagram.getDefinition();
        assertEquals(actualResult, qianHex, "Hexagram must be set");
        assertEquals(actualRes, def, "Definition must be set");
    }

    @Test
    public void getResultTest() {
        char actualResult = hexagram.getHexagram();
        char qianHex = '䷀';
        assertEquals(actualResult, qianHex, "Method must return Hexagram character");
    }

    @Test
    public void getDefinitionTest() {
        String def = "Tianxingjian";
        String actualResult = hexagram.getDefinition();
        assertEquals(actualResult, def, "Method must return definition");
    }

    @Test
    public void equalsTest() {
        assertEquals(hexagram, new Hexagram('䷀', "Tianxingjian"), "if all attributes are equal than these two objects are equal");
        assertEquals(hexagram, hexagram, "object should equal to itself");
        assertNotEquals(hexagram, new Object(), "object of different type should not be equal");
        assertNotEquals(hexagram, new Hexagram('䷉', "Tianxingjian"), "if hexagram are not the same, objects are not equal");
        assertNotEquals(hexagram, new Hexagram('䷀', "Dishikun"), "if definitions are not the same, objects are not equal");
    }

    @Test
    public void toStringTest() {
        String expected = '䷀' + "\n" + "Tianxingjian";
        assertEquals(expected, hexagram.toString(), "To String should have hexagram char + '\\n' + definition format ");
    }
}
