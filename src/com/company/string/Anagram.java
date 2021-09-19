package com.company.string;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static boolean isAnagramArray(String text1, String text2) {
        char[] text1Array = text1.toLowerCase(Locale.ROOT).toCharArray();
        char[] text2Array = text2.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(text1Array);
        Arrays.sort(text2Array);
        return Arrays.equals(text1Array, text2Array);
    }

    public static boolean isAnagramStringBuilder(String text1, String text2) {
        text1 = text1.toLowerCase(Locale.ROOT);
        StringBuilder text2Builder = new StringBuilder(text2.toLowerCase(Locale.ROOT));
        for (int i = 0; i < text1.length(); i++) {
            int index = text2Builder.indexOf("" + text1.charAt(i));
            if (index == -1) {
                return false;
            } else {
                text2Builder.deleteCharAt(index);
            }
        }
        return text2Builder.length() == 0;
    }
}
