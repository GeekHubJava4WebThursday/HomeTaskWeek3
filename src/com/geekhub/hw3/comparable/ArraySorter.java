package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Integer i[] = new Integer[]{2343, 2, 6, 1, 0, -1};
        String s[] = new String[]{"abc", "54", "op"};

        Comparable[] sortedIntegers = sort(i);
        Comparable[] sortedStrings = sort(s);

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));

        /* Output
        Sorted integers: [-1, 0, 1, 2, 6, 2343]
        Sorted strings: [54, abc, op
        */

    }

    /**
     * Sorts array of the comparable elements
     *
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {

        Comparable[] cloneElements = elements.clone();

        for (int i = 0; i < cloneElements.length; i++) {
            for (int j = 0; j < cloneElements.length - (i + 1); j++) {
                int compareResult = cloneElements[j].compareTo(cloneElements[j + 1]);

                if (compareResult > 0) {
                    Comparable temp = cloneElements[j];
                    cloneElements[j] = cloneElements[j + 1];
                    cloneElements[j + 1] = temp;
                }
            }
        }
        return cloneElements;
    }
}
