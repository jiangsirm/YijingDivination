package com.example.divination;

/**
 * class for Yijing Hexagrams
 */
public class Hexagram {
    /**
     * char for hexagram characters using unicode 8
     */
    private final char hexagram;

    /**
     * String for definitions
     */
    private final String definition;

    /**
     * constructor for hexagram that takes a unicode char and a String
     *
     * @param hex the hexagram character using unicode.
     * @param def a line of definition for the hexagram.
     */
    Hexagram(char hex, String def) {
        hexagram = hex;
        definition = def;
    }

    /**
     * getter for the hexagram character
     *
     * @return a char for hexagram in unicode
     */
    public char getHexagram() {
        return hexagram;
    }

    /**
     * getter for definition
     *
     * @return a String for the definition of the hexagram.
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * overriding equals method.
     * <p>if two hexagram has the same definition and hexagram character, they are the same.
     *
     * @param obj the object to be compared to.
     * @return a boolean for whether they are the same.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Hexagram)) return false;
        Hexagram h = (Hexagram) obj;
        return h.getHexagram() == this.getHexagram() &&
                h.getDefinition().equals(this.getDefinition());
    }

    /**
     * overriding the toString method.
     *
     * @return a String consist of a line of hexagram character followed by a line of definition.
     */
    @Override
    public String toString() {
        return hexagram + "\n" + definition;
    }
}
