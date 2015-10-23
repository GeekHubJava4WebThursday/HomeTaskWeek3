package com.geekhub.hw3.comparable;

import java.util.Arrays;

/**
 * test sorting arrays
 */
public class TestSorting {

  public static void main(String[] args) {

        // initial arrays which will be sorted
        String[] strings = {"ab", "ae", "ac", "12", "25", "ad", "1", "aa"};
        Integer[] integers = {Integer.valueOf(2343), Integer.valueOf(2),
                              Integer.valueOf(6),    Integer.valueOf(1),
                              Integer.valueOf(0),    Integer.valueOf(-7),
                              Integer.valueOf(10),   Integer.valueOf(-1)};

        // sorting
        Comparable[] sortedStrings = ArraySorter.sort(strings);
        Comparable[] sortedIntegers = ArraySorter.sort(integers);

        // output
        System.out.println("Unsorted integers : " + Arrays.toString(integers));
        System.out.println("Sorted integers   : " + Arrays.toString(sortedIntegers) + "\n");
        System.out.println("Unsorted strings : " + Arrays.toString(strings));
        System.out.println("Sorted strings   : " + Arrays.toString(sortedStrings));
    }
}
