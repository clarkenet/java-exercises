package com.company.string;

import java.util.Locale;

public class StringPalindrome {
    public static boolean iterative(String text) {
        if (text.length() < 1) {
            return false;
        }
        if (text.length() == 1) {
            return true;
        }
        char[] array = text.toLowerCase().toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static String reverse(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.charAt(text.length() - 1)
                + reverse(text.substring(0, text.length() - 1));
    }

    public static boolean comparative(String text) {
        if (text.length() < 1) {
            return false;
        }
        if (text.length() == 1) {
            return true;
        }
        return text.equalsIgnoreCase(reverse(text));
    }
}
