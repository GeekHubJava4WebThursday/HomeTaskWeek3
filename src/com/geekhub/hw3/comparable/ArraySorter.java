package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{Integer.valueOf(2343), Integer.valueOf(2), Integer.valueOf(6)});
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op" });
        Comparable[] sortedIntegers2 = bubbleSort(new Integer[]{Integer.valueOf(811), Integer.valueOf(5), Integer.valueOf(455)});
        Comparable[] sortedStrings2 = bubbleSort(new String[]{ "ddddc", "aaaac", "bbbbc" });

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers2));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings2));
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        //TODO: Implement without using Arrays.sort method
        Comparable[] copyElements = Arrays.copyOf(elements,elements.length);
        for (int i = 1; i < copyElements.length; i++) {
            for (int j = i; j>0 && copyElements[j-1].compareTo(copyElements[j])>0 ; j--) {
                Comparable temp = copyElements[j];
                copyElements[j]=copyElements[j-1];
                copyElements[j-1]=temp;
            }
        }
        return copyElements;
    }

    public static Comparable[] bubbleSort(Comparable[] elements){
        Comparable[] copyElements = Arrays.copyOf(elements,elements.length);
        for (int i = 0; i < copyElements.length ; i++) {
            for (int j = i+1; j < copyElements.length ; j++) {
                if (copyElements[i].compareTo(copyElements[j])>0){
                    Comparable temp = copyElements[i];
                    copyElements[i]=copyElements[j];
                    copyElements[j]=temp;
                }
            }
        }
        return copyElements;
    }

}
