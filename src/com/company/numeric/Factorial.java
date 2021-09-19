package com.company.numeric;

public class Factorial {
    public static int recursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * recursive(num - 1);
    }

    public static int iterative(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
