package com.example.divination;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestYijing {

    @Test
    public void constructorTest() {
        assertEquals(Yijing.YI_JING.get("00"), new Hexagram('䷁', "K'un / The Receptive"), "'00' refers to Kun hexagram");
        assertEquals(Yijing.YI_JING.get("77"), new Hexagram('䷳', "Kên / Keeping Still, Mountain"), "77 refers to Ken (gen)");
    }
}
