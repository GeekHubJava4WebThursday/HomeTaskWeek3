package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Random;

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
        Comparable[] sortedElements = Arrays.copyOf(elements, elements.length);
        randomizedQuickSort(sortedElements, 0, sortedElements.length - 1);
        return sortedElements;
    }

    private static Random integerRandomGenerator = new Random();

    /**
     * Sorts array/subarray of the comparable elements
     * @param array array/subarray for sorting
     * @param low first index of subarray (inclusive)
     * @param high last index of subarray (inclusive)
     */
    private static void randomizedQuickSort(Comparable[] array, int low, int high) {
        int randomizedMiddle;
        if(low < high) {
            randomizedMiddle = randomizedPartition(array, low, high);
            randomizedQuickSort(array, low, randomizedMiddle - 1);
            randomizedQuickSort(array, randomizedMiddle + 1, high);
        }
    }

    private static int randomizedPartition(Comparable[] array, int low, int high) {
        Comparable tmp;
        int i;

        i = integerRandomGenerator.nextInt(high - low) + low;
        tmp = array[high];
        array[high] = array[i];
        array[i] = tmp;
        return partition(array, low, high);
    }

    private static int partition(Comparable[] array, int low, int high) {
        Comparable x;
        Comparable tmp;
        int i, j;

        x = array[high];
        i = low - 1;
        for(j = low; j < high; j++) {
            if (array[j].compareTo(x) <= 0) {
                i++;
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        tmp = array[high];
        array[high] = array[i+1];
        array[i+1] = tmp;

        return i + 1;
    }

}
