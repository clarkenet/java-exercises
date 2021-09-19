package com.company.numeric;

/*
A number is called an Armstrong number if it is equal to the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1+125+27, which is equal to 1^3+5^3+3^3.
 */
public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int aux = num;
        int result = 0;
        while (aux != 0) {
            result += (int) Math.pow((aux % 10), 3);
            aux /= 10;
        }
        return num == result;
    }
}
