package com.company.numeric;

public class ArrangeEvens {
    //Gets a Fibonacci fixed array and rearranges the content
    //Even numbers at the left and odds at the right
    //The order doesn't matter but cannot use any other auxiliary datastructures
    public static int[] arrangeFibonacciEvens(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                array[i] = array[even];
                array[even] = temp;
                even++;
            }
        }
        return array;
    }
}
