package com.company;

import com.company.array.ArrayDuplicate;
import com.company.datastructure.CustomLinkedList;
import com.company.numeric.*;
import com.company.string.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //Prints the result of several exercises found in
    //https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html?m=1
    public static void main(String[] args) {
        System.out.println("1. Fibonacci");
        System.out.println("Iterative: " + FibonacciSeries.iterative(10).stream().map(Object::toString).collect(Collectors.joining(", ")));
        System.out.println("Recursive: " + FibonacciSeries.recursive(10).stream().map(Object::toString).collect(Collectors.joining(", ")));
        System.out.println();

        System.out.println("2. Prime Number");
        int prime = 23;
        System.out.println(prime + " is Prime Number: " + PrimeNumber.isPrime(prime));
        System.out.println();

        System.out.println("3. String Palindrome");
        String textPal = "Bob";
        System.out.println(textPal + " is Palindrome (iterative): " + StringPalindrome.iterative(textPal));
        System.out.println(textPal + " is Palindrome (comparative): " + StringPalindrome.comparative(textPal));
        System.out.println();

        System.out.println("4. Integer Palindrome");
        int numPal = -12121;
        System.out.println(numPal + " is Palindrome: " + IntegerPalindrome.isPalindrome(numPal));
        System.out.println();

        System.out.println("5. Armstrong Number");
        int armstrong = -407;
        System.out.println(armstrong + " is an Armstrong Number: " + ArmstrongNumber.isArmstrong(armstrong));
        System.out.println();

        System.out.println("7. Factorial");
        int fac = 9;
        System.out.println("Factorial (recursive) of " + fac + ": " + Factorial.recursive(fac));
        System.out.println("Factorial (iterative) of " + fac + ": " + Factorial.iterative(fac));
        System.out.println();

        System.out.println("8. Reverse String");
        String textRev = "Hey you!!";
        System.out.println("In-place: " + StringReverse.iterativeInPlace(textRev));
        System.out.println("Using StringBuilder: " + StringReverse.iterativeString(textRev));
        System.out.println("Recursive: " + StringReverse.recursive(textRev));

        System.out.println("9. Remove duplicated from Array (any comparable object)");
        //Arrays.asList() creates a fixed List, therefore it can be modified
        //To solve it, create a new LinkedLIst (faster for modifications)
        List<Integer> dupIntegers = new LinkedList<>(Arrays.asList(2, 4, 11, 5, 4, 2, 8));
        ArrayDuplicate<Integer> integerArrayDuplicate = new ArrayDuplicate<>();
        System.out.println("Before process (integer): " + dupIntegers);
        System.out.println("After process (integer): " + integerArrayDuplicate.removeDuplicates(dupIntegers));
        List<String> dubStrings = new LinkedList<>(Arrays.asList("Hey", "hola", "a", "b", "B", "hola", "b"));
        ArrayDuplicate<String> stringArrayDuplicate = new ArrayDuplicate<>();
        System.out.println("Before process (string): " + dubStrings);
        System.out.println("After process (string): " + stringArrayDuplicate.removeDuplicates(dubStrings));
        System.out.println();

        System.out.println("10. Print Patterns");
        int rows = 5;
        System.out.println("Pyramid Pattern");
        PrintPattern.printPyramidPattern(rows);
        System.out.println("Pyramid Numbers");
        PrintPattern.printPyramidNumber(rows);
        System.out.println("Triangle");
        PrintPattern.printTriangle(rows);
        System.out.println("Triangle Reverse");
        PrintPattern.printTriangleReverse(rows);
        System.out.println();

        System.out.println("11. Print repeated characters of string");
        StringDuplicate.printRepeated("Repeated r ");
        System.out.println();

        System.out.println("18. Anagram");
        String anagram1 = "Sola";
        String anagram2 = "Laso";
        System.out.printf("%s is anagram of %s (array): %b\n", anagram1, anagram2, Anagram.isAnagramArray(anagram1, anagram2));
        System.out.printf("%s is anagram of %s (array): %b\n", anagram1, anagram2, Anagram.isAnagramStringBuilder(anagram1, anagram2));
        String anagram3 = "Sola";
        String anagram4 = "Lasos";
        System.out.printf("%s is anagram of %s (array): %b\n", anagram1, anagram2, Anagram.isAnagramArray(anagram3, anagram4));
        System.out.printf("%s is anagram of %s (array): %b\n", anagram1, anagram2, Anagram.isAnagramStringBuilder(anagram3, anagram4));
        System.out.println();

        System.out.println("34. Print permutations");
        String perm = "GOD";
        System.out.println("Permutations (recursive) of " + perm);
        Permutations.showRecursive(perm);
        System.out.println();

        System.out.println("39. Reverse CustomLinkedList");
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(3);
        linkedList.add(16);
        linkedList.add(1);
        System.out.println("Original content (iterative): " + linkedList.print());
        linkedList.reverseIterative();
        System.out.println("Reversed content (iterative): " + linkedList.print());
        linkedList = new CustomLinkedList();
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(3);
        linkedList.add(16);
        linkedList.add(1);
        System.out.println("Original content (recursive): " + linkedList.print());
        linkedList.reverseRecursive();
        System.out.println("Reversed content (recursive): " + linkedList.print());
        System.out.println();

        System.out.println("40. Find the length of the LinkedList");
        System.out.println("Iterative: " + linkedList.iterativeSize());
        System.out.println("Recursive: " + linkedList.recursiveSize());
        System.out.println();

        System.out.println("41. Check if LinkedList has a loop");
        System.out.println("Before making it cyclic: " + linkedList.isCyclic());
        linkedList.makeCyclic();
        System.out.println("After making it cyclic: " + linkedList.isCyclic());
        System.out.println();

        System.out.println("44.1. Find the Nth element from a LinkedList's end");
        linkedList = new CustomLinkedList();
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(3);
        linkedList.add(16);
        linkedList.add(1);
        int eleFromEnd = 4;
        System.out.printf("The %d element from end is %d\n", eleFromEnd, linkedList.getFromEnd(eleFromEnd));
        System.out.println();

        System.out.println("45. Sort a Java LinkedList");
        List<Integer> numList = new LinkedList<>(Arrays.asList(2, 6, 1, 0, 10, 5));
        System.out.println("Before sorting: " + numList);
        Collections.sort(numList);
        System.out.println("After sorting (Collections sort natural)): " + numList);
        numList = new LinkedList<>(Arrays.asList(2, 6, 1, 0, 10, 5));
        Collections.sort(numList, Comparator.reverseOrder());
        System.out.println("After sorting (Collections sort with Comparator)): " + numList);
        numList = new LinkedList<>(Arrays.asList(2, 6, 1, 0, 10, 5));
        Collections.sort(numList, (a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0);
        System.out.println("After sorting (Collections sort with custom Comparator)): " + numList);
        numList = new LinkedList<>(Arrays.asList(2, 6, 1, 0, 10, 5));
        numList.sort((a, b) -> b.compareTo(a));
        System.out.println("After sorting (list sort with Integer.compareTo())): " + numList);
        System.out.println();

        System.out.println("48. Check if two string rotation of each other");
        String rotation1 = "abcd";
        String rotation2 = "bcda";
        System.out.printf("Is \"%s\" rotation of \"%s\"? %b\n", rotation2, rotation1, StringRotation.isRotation(rotation1, rotation2));
        System.out.println();
    }
}
