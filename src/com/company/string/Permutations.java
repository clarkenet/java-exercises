package com.company.string;

public class Permutations {
    public static void showRecursive(String text) {
        recursive("", text);
    }

    private static void recursive(String perm, String text) {
        if (text.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < text.length(); i++) {
                recursive(perm + text.charAt(i),
                        text.substring(0, i) + text.substring(i+1, text.length()));
            }
        }
    }
}
