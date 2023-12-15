package com.company.numeric;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597...
 */
public class FibonacciSeries {
    public static List<Integer> iterative(int iterations) {
        if (iterations <= 0) {
            return null;
        }
        List<Integer> serie = new ArrayList<>();
        int fib1 = 1;
        int fib2 = 0;
        serie.add(fib1);

        for (int i = 2; i <= iterations; i++) {
            int temp = fib1 + fib2;
            serie.add(temp);
            fib2 = fib1;
            fib1 = temp;
        }
        return serie;
    }

    private static int recursiveHelper(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return recursiveHelper(number - 1) + recursiveHelper(number - 2);
    }

    public static List<Integer> recursive(int iterations) {
        if (iterations <= 0) {
            return null;
        }
        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= iterations; i++) {
            series.add(recursiveHelper(i));
        }
        return series;
    }

    // Gets the last number of a pretty big fibonacci series (using BigInteger)
    public static BigInteger getFibonacci(int number) {
        if (number == 0 || number == 1) {
            return BigInteger.valueOf(number);
        }
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;

        for (int i = 2; i <= number; i++) {
            BigInteger aux = a.add(b);
            b = a;
            a = aux;
        }
        return a;
    }
}
