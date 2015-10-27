package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op" });

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
    }

    /**
     * Sorts array of the comparable elements
     * Sorting by bubble sort algorithm
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        Comparable[] elemCopy = elements;
        Comparable elemBuffer = null;
        //
        for(int i=0; i <elemCopy.length-1; i++) {
            for(int j=i+1; j < elemCopy.length; j++) {
                if(elemCopy[i].compareTo(elemCopy[j])>0){
                    elemBuffer = elemCopy[i];
                    elemCopy[i] = elemCopy[j];
                    elemCopy[j] = elemBuffer;
                }
            }
        }
        return elemCopy;
    }
}
