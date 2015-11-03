package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op" });
        Comparable[] sortedStrings1 = sort(new String[]{"abc", "54", "op", "1", "645", "123"});

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings1));
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        //TODO: Implement without using Arrays.sort method
        Comparable[] copy = Arrays.copyOf(elements, elements.length);

        for (int i = 0; i < elements.length; i++){
            for(int j = i; j < elements.length; j++){
                if (copy[i].compareTo(copy[j]) > 0){
                    Comparable element = copy[j];
                    copy[j] = copy[i];
                    copy[i] = element;
                }
            }

        }
        return copy;
    }
}
