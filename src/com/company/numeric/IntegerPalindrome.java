package com.company.numeric;

public class IntegerPalindrome {
    public static boolean isPalindrome(int num) {
        if ((num == 0) || (num / 10 == 0)) {
            return true;
        }

        int aux = num;
        int reversed = 0;
        while (aux != 0) {
            reversed = reversed * 10 + (aux % 10);
            aux /= 10;
        }
        return num == reversed;
    }
}
