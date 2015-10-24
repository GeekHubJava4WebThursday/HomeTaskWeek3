package com.geekhub.hw3.comparable;

import java.lang.Comparable;

public class ArraySorter {

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        //TODO: Implement without using Arrays.sort method
        Comparable[] clone = (Comparable[]) elements.clone();
        quickSort(clone, 0, clone.length - 1);
        return clone;
    }

    /**
     * quick sort
     * @param elements array which will be sorted
     * @param start first index of array
     * @param end last index of array
     */
    private static void quickSort(Comparable[] elements, int start, int end) {
        if (end > start) {
            int q = partition(elements, start, end);
            quickSort(elements, start, q - 1);
            quickSort(elements, q + 1, end);
        }
    }

    /**
     * method of partition
     * @param elements array which will be sorted
     * @param start first index of array
     * @param end last index of array
     * @return partition index in array
     */
    private static int partition(Comparable[] elements, int start, int end) {
        Comparable x = elements[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (elements[j].compareTo(x) > 0) {
                i = i + 1;
                swap(elements, i, j);
            }
        }
        swap(elements, i + 1, end);
        return i + 1;
    }

    /**
     * swapping two elements in array
     * @param a first index
     * @param b second index
     */
    private static void swap(Comparable[] elements, int a, int b) {
        Comparable change = elements[a];
        elements[a] = elements[b];
        elements[b] = change;
    }
}
