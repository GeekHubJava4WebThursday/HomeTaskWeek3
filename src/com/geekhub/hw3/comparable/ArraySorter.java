package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{ 2343, 2, 6, 1, 0, -1 });
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op" });
        Comparable[] sortedShorts = sort(new Short[]{ 5, -2, 3, -1, 4, 4 ,0 });

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
        System.out.println("Sorted shorts: " + Arrays.toString(sortedShorts));
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        /*
        * Traditional insertion sort
        * Good for small arrays
        */

        for (int i = 0, j = i; i < elements.length - 1; j = ++i) {
            Comparable ai = elements[i + 1];
            while (ai.compareTo(elements[j]) < 0) {
                elements[j + 1] = elements[j];
                if (j-- == 0) {
                    break;
                }
            }
            elements[j + 1] = ai;
        }

        return elements;
    }
}
