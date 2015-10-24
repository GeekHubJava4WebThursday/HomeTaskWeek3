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
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        Comparable[] copyArray = Arrays.copyOf(elements, elements.length);;

        for(int i = 0; i < elements.length - 1; i++){
            for(int j = i + 1; j < elements.length; j++){
                if(copyArray[i].compareTo(copyArray[j]) > 0){
                    Comparable element = copyArray[j];
                    copyArray[j] = copyArray[i];
                    copyArray[i] = element;
                }
            }
        }
        return copyArray;
    }
}
