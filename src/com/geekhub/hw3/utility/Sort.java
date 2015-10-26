package com.geekhub.hw3.utility;

import java.util.Arrays;

public class Sort {

    /**
     * @param elements - input array of Compatible objects
     * @return array of elements sorted by selection sort algorithm
     */
    public static Comparable[] sort(Comparable[] elements) {
        int minIndex;
        Comparable[] array = elements.clone();
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
        return array;
    }

    /**
     * @param elements - array
     * @param elem1Index - index of first element to swap
     * @param elem2Index - index of second element to swap
     */
    public static void swap (Comparable[] elements, int elem1Index, int elem2Index) {
        try {
            Comparable bufferElem = elements[elem1Index];
            elements[elem1Index] = elements[elem2Index];
            elements[elem2Index] = bufferElem;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds!");
        }
    }

    public static void testSort() {
        Comparable[] intArray = new Integer[]{123,12,54,2,456,2};
        System.out.println("Integer array: ");
        System.out.println("Origin: " + Arrays.toString(intArray));
        System.out.println("Sorted: " + Arrays.toString(sort(intArray)));
        System.out.println("Origin: " + Arrays.toString(intArray));

        System.out.println("String array: ");
        Comparable[] strArray = new String[]{"123","12","54","2","456","2"};
        System.out.println("Origin: " + Arrays.toString(strArray));
        System.out.println("Sorted: " + Arrays.toString(sort(strArray)));
        System.out.println("Origin: " + Arrays.toString(strArray));
    }
}
