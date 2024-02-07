package com.example.divination;

import java.util.HashMap;

/**
 * class for Yijing with 64 hexagrams
 * <p> The constant map of Hexagrams can be accessed via Yijing.YI_JING.
 */
public final class Yijing {

    /**
     * provide a constant map for yijing hexagrams with a definition
     * <p>The key is a String consist of two-digits number where both digits range from 0~7.
     * <p>The left digits refers to the trigram on top, while the other refers to the trigram beneath.
     * <p> From 0 to 7, hexagrams are corresponded as such:
     * <p> 0: ☷, 1: ☰, 2: ☱, 3: ☲, 4: ☳, 5: ☴, 6: ☵, 7: ☶.
     * <p> Example: 00 refers to ䷁, 17 refers to ䷠.
     */
    public static final HashMap<String, Hexagram> YI_JING = new HashMap<>();

    static {
        YI_JING.put("00", new Hexagram('䷁', "K'un / The Receptive"));
        YI_JING.put("01", new Hexagram('䷊', "T'ai / Peace"));
        YI_JING.put("02", new Hexagram('䷒', "Lin / Approach"));
        YI_JING.put("03", new Hexagram('䷣', "Ming I / Darkening of the Light"));
        YI_JING.put("04", new Hexagram('䷗', "Fu / Return (The Turning Point)"));
        YI_JING.put("05", new Hexagram('䷭', "Shêng / Pushing Upward"));
        YI_JING.put("06", new Hexagram('䷆', "Shih / The Army"));
        YI_JING.put("07", new Hexagram('䷎', "Ch'ien / Modesty"));

        YI_JING.put("10", new Hexagram('䷋', "P'i / Standstill (Stagnation)"));
        YI_JING.put("11", new Hexagram('䷀', "Ch'ien / The Creative"));
        YI_JING.put("12", new Hexagram('䷉', "Lu / Treading (Conduct)"));
        YI_JING.put("13", new Hexagram('䷌', "T'ung Jên / Fellowship with Men"));
        YI_JING.put("14", new Hexagram('䷘', "Wu Wang / Innocence (The Unexpected)"));
        YI_JING.put("15", new Hexagram('䷫', "Kou / Coming to Meet"));
        YI_JING.put("16", new Hexagram('䷅', "Sung / Conflict"));
        YI_JING.put("17", new Hexagram('䷠', "Tun / Retreat"));

        YI_JING.put("20", new Hexagram('䷬', "Ts'ui / Gathering Together (Massing)"));
        YI_JING.put("21", new Hexagram('䷪', "Kuai / Break-through (Resoluteness)"));
        YI_JING.put("22", new Hexagram('䷹', "Tui / The Joyous, Lake"));
        YI_JING.put("23", new Hexagram('䷰', "Ko / Revolution (Molting)"));
        YI_JING.put("24", new Hexagram('䷐', "Sui / Following"));
        YI_JING.put("25", new Hexagram('䷛', "Ta Kuo / Preponderance of the Great"));
        YI_JING.put("26", new Hexagram('䷮', "K'un / Oppression (Exhaustion)"));
        YI_JING.put("27", new Hexagram('䷞', "Hsien / Influence (Wooing)"));

        YI_JING.put("30", new Hexagram('䷢', "Chin / Progress"));
        YI_JING.put("31", new Hexagram('䷍', "Ta Yu / Possession in Great Measure"));
        YI_JING.put("32", new Hexagram('䷥', "K'uei / Opposition"));
        YI_JING.put("33", new Hexagram('䷝', "Li / The Clinging, Fire"));
        YI_JING.put("34", new Hexagram('䷔', "Shih Ho / Biting Through"));
        YI_JING.put("35", new Hexagram('䷱', "Ting / The Caldron"));
        YI_JING.put("36", new Hexagram('䷿', "Wei Chi / Before Completion"));
        YI_JING.put("37", new Hexagram('䷷', "Lu / The Wanderer"));

        YI_JING.put("40", new Hexagram('䷏', "Yu / Enthusiasm"));
        YI_JING.put("41", new Hexagram('䷡', "Ta Chuang / The Power of the Great"));
        YI_JING.put("42", new Hexagram('䷵', "Kuei Mei / The Marrying Maiden"));
        YI_JING.put("43", new Hexagram('䷶', "Fêng / Abundance (Fullness)"));
        YI_JING.put("44", new Hexagram('䷲', "Chên / The Arousing (Shock, Thunder)"));
        YI_JING.put("45", new Hexagram('䷟', "Hêng / Duration"));
        YI_JING.put("46", new Hexagram('䷧', "Hsieh / Deliverance"));
        YI_JING.put("47", new Hexagram('䷽', "Hsiao Kuo / Preponderance of the Small"));

        YI_JING.put("50", new Hexagram('䷓', "Kuan / Contemplation (View)"));
        YI_JING.put("51", new Hexagram('䷈', "Hsiao Ch'u / The Taming Power of the Small"));
        YI_JING.put("52", new Hexagram('䷼', "Chung Fu / Inner Truth"));
        YI_JING.put("53", new Hexagram('䷤', "Chia Jên / The Family (The Clan)"));
        YI_JING.put("54", new Hexagram('䷩', "I / Increase"));
        YI_JING.put("55", new Hexagram('䷸', "Sun / The Gentle (The Penetrating, Wind)"));
        YI_JING.put("56", new Hexagram('䷺', "Huan / Dispersion (Dissolution)"));
        YI_JING.put("57", new Hexagram('䷴', "Chien / Development (Gradual Progress)"));

        YI_JING.put("60", new Hexagram('䷇', "Pi / Holding Together (Union)"));
        YI_JING.put("61", new Hexagram('䷄', "Hsu / Waiting (Nourishment)"));
        YI_JING.put("62", new Hexagram('䷻', "Chieh / Limitation"));
        YI_JING.put("63", new Hexagram('䷾', "Chi Chi / After Completion"));
        YI_JING.put("64", new Hexagram('䷂', "Chun / Difficulty at the Beginning"));
        YI_JING.put("65", new Hexagram('䷯', "Ching / The Well"));
        YI_JING.put("66", new Hexagram('䷜', "K'an / The Abysmal (Water)"));
        YI_JING.put("67", new Hexagram('䷦', "Chien / Obstruction"));

        YI_JING.put("70", new Hexagram('䷖', "Po / Splitting Apart"));
        YI_JING.put("71", new Hexagram('䷙', "Ta Ch'u / The Taming Power of the Great"));
        YI_JING.put("72", new Hexagram('䷨', "Sun / Decrease"));
        YI_JING.put("73", new Hexagram('䷕', "Pi / Grace"));
        YI_JING.put("74", new Hexagram('䷚', "I / The Corners of the Mouth (Providing Nourishment)"));
        YI_JING.put("75", new Hexagram('䷑', "Ku / Work on What Has Been Spoiled (Decay)"));
        YI_JING.put("76", new Hexagram('䷃', "Mêng / Youthful Folly"));
        YI_JING.put("77", new Hexagram('䷳', "Kên / Keeping Still, Mountain"));
    }
}
