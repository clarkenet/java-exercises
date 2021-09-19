package com.company.string;

public class StringReverse {
    public static String iterativeInPlace(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        char[] array = text.toCharArray();
        char temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return String.copyValueOf(array);
    }

    public static String iterativeString(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        //Or converting String to StringBuilder and reversing: string.reverse()
        return reversed.toString();
    }

    public static String recursive(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.charAt(text.length() - 1)
                + recursive(text.substring(0, text.length() - 1));
    }
}
