package com.company.string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringDuplicate {
    public static void printRepeated(String text) {
        text = text.toUpperCase(Locale.ROOT);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        map.entrySet().stream().filter(m -> m.getValue() > 1)
                .forEach(m -> System.out.printf("%c is repeated %d times\n", m.getKey(), m.getValue()));
    }
}
