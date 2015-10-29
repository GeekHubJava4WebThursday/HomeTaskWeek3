package com.geekhub.hw3.comparable;

import java.lang.Comparable;
import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Comparable[] sortedIntegers = sort(new Integer[]{2343, 2, 6, 1, 0, -1});
        Comparable[] sortedStrings = sort(new String[]{"abc", "54", "op", "2"});
        Comparable[] sortedCar = sort(new Car[]{new Car(200), new Car(320), new Car(160)});

        System.out.println("Sorted integers: " + Arrays.toString(sortedIntegers));
        System.out.println("Sorted strings: " + Arrays.toString(sortedStrings));
        System.out.println("Sorted strings: " + Arrays.toString(sortedCar));
    }

    /**
     * Sorts array of the comparable elements
     *
     * @return sorted array
     */
    public static Comparable[] sort(Comparable[] elements) {
        //TODO: Implement without using Arrays.sort method

    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = elements.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (elements[j].compareTo(elements[j + 1]) < 0) {
                    Comparable tmp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = tmp;
                }
            }
        }

        return elements;
    }
}