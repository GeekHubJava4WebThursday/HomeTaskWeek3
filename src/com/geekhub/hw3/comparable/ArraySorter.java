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

        Comparable[] sortedIntegers = sort(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sort(new String[]{ "abc", "54", "op" });
        Comparable[] sortedUsers = sort(users);

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
        System.out.println("Sorted users: " + Arrays.toString(sortedUsers));
    }

    /**
     * Sorts array of the comparable elements
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        Arrays.sort(elements);
        return elements;
    }
}
