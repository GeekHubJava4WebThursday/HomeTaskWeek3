package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op"});
        String s = "acb";
        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        Comparable[] cloneComp = elements;
        Comparable comparable = null;
        for(int i = 0; i < cloneComp.length - 1; i++){
            for(int j = i+1; j < cloneComp.length ; j++){
                int res = cloneComp[i].compareTo(cloneComp[j]);
                if(res > 0){
                    comparable = cloneComp[i];
                    cloneComp[i] = cloneComp[j];
                    cloneComp[j] = comparable;
                }
            }
        }
        return cloneComp;
    }



}
