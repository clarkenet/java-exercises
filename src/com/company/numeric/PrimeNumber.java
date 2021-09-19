package com.company.numeric;

//Prime Numbers: 2, 3, 5, 7, 9, 11, 13, 17, 19, 23...
public class PrimeNumber {
    public static boolean isPrime(int num) {
        //Invalid
        if (num < 2) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        //If n is divisible by 2 is not Prime (evens)
        if (num % 2 == 0) {
            return false;
        }
        //Multiples can only be found between 2 and sqrt(n)
        int sqrt = (int) Math.sqrt(num);
        //Only looping odd numbers since we already tested evens
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
