package com.geekhub.hw3.comparable;

import com.geekhub.hw3.auth.User;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        User[] users = {
                new User("Spider-Man", "osborn"),
                new User("Geekhub", "qwe123"),
                new User("Batman", "catwoman"),
                new User("Programmer", "bag.bag.bag"),
                new User("Superman", "darkseid")
        };

        Comparable[] sortedIntegers = sortInAscending(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sortInAscending(new String[]{"abc", "54", "op"});
        Comparable[] sortedUsers = sortInDescending(users);

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers)); //Result: [-1, 0, 1, 2, 6, 2343]
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings)); //Result: [54, abc, op]
        System.out.println("Sorted users: " + Arrays.toString(sortedUsers)); //Result: [Superman, Spider-Man, Programmer, Geekhub, Batman]
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sortInAscending(Comparable[] elements) {
        for(int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j].compareTo(elements[j + 1]) > 0) {
                    swap(elements, j);
                }
            }
        }
        return elements;
    }

    public static Comparable[] sortInDescending(Comparable[] elements) {
        for(int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j].compareTo(elements[j + 1]) < 0) {
                    swap(elements, j);
                }
            }
        }
        return elements;
    }

    private static void swap(Comparable[] objects, int index) {
        Comparable o = objects[index];
        objects[index] = objects[index + 1];
        objects[index + 1] = o;
    }
}
