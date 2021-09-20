package com.company.string;

import java.util.Locale;

public class StringRotation {
    /*
    Verifies if text2 is rotation of text1.
    A String is said to be a rotation of other string if they contain same characters and the sequence is rotated
    across any character.
    Ex. "dabc" is rotation of "abcd", whereas "adbc" is not
     */
    public static boolean isRotation(String text1, String text2) {
        //If strings are not the same length, they are not rotation
        if (text1 == null || text2 == null || (text1.length() != text2.length())) {
            return false;
        }
        text1 = text1.toLowerCase(Locale.ROOT);
        text2 = text2.toLowerCase(Locale.ROOT);
        //Get the index of text2 where index 0 of text1 matches
        //Ex. "a" in "abcd" is the index 0. Get the index of "a" from text2
        int index = text2.indexOf(text1.charAt(0));

        //If index == -1, text2 is not rotation of text1 (char not found in text2)
        if (index == -1) {
            return false;
        }

        //Start comparing from text1 index 1 (index 0 is already checked)
        for (int i = 1; i < text1.length(); i++) {
            index++;
            //Verify if we haven't reached the end of text2
            //If so, move index to the beginning of text2 (0)
            if (index >= text2.length()) {
                index = 0;
            }

            //If any of the characters don't match, it's not a rotation
            if (text1.charAt(i) != text2.charAt(index)) {
                return false;
            }
        }
        return true;
    }
}
