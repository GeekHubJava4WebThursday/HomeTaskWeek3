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

    public static Comparable[] sort(Comparable[] elements) {
        Comparable[] copyCmp = elements;
        Comparable current = null;
        for(int i=0; i <copyCmp.length-1; i++) {
            for(int j=i+1; j < copyCmp.length; j++) {
                int compVal = copyCmp[i].compareTo(copyCmp[j]);
                if(compVal>0){
                    current = copyCmp[i];
                    copyCmp[i] = copyCmp[j];
                    copyCmp[j] = current;
                }
            }
        }
        return copyCmp;
    }
}
