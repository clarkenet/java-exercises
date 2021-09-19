package com.company.string;

public class PrintPattern {
    public static void printPyramidPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            //Prints spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            //Prints pattern with spaces
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            //Prints end of line
            System.out.println();
        }
    }

    public static void printPyramidNumber(int rows) {
        for (int i = 0; i < rows; i++) {
            //Prints spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            //Prints pattern with spaces
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            //Prints end of line
            System.out.println();
        }
    }

    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangleReverse(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
