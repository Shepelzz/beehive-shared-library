package org.beehive.lib.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class TextUtils {

    public static String fixColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static List<String> fixColors(List<String> lores) {
        if (lores == null) {
            return null;
        }
        List<String> result = new ArrayList<>();
        for (String loreLine : lores) {
            result.add(fixColor(loreLine));
        }
        return result;
    }

    public static String toRoman(int number) {
        switch (number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            default: return String.valueOf(number);
        }
    }

    public static int romanToInt(String roman) {
        switch (roman) {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            default: return 1;
        }
    }

}
