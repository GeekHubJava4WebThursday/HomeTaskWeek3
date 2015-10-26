package com.geekhub.hw3;

import com.geekhub.hw3.user.UserManager;
import com.geekhub.hw3.utility.Parser;
import com.geekhub.hw3.utility.Sort;
import com.geekhub.hw3.utility.TestString;

import java.util.Scanner;

public class Main {

    public static int NUMBER_OF_ITERATIONS = 100000;
    public static String APPEND_STRING = "a";

    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1 - Sort Comparable Objects");
        System.out.println("2 - Test String Types Concatenation Performance");
        System.out.println("3 - Test User Manager Exceptions");
        System.out.println("4 - Test parseInt");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Sort.testSort();
                    break;
                case 2:
                    TestString.testStringConcatPerformance(NUMBER_OF_ITERATIONS, APPEND_STRING);
                    break;
                case 3:
                    UserManager.testUserManager();
                    break;
                case 4:
                    System.out.println(Parser.parseInt("123"));
                    break;
                default:
                    System.exit(0);
            }
        } else {
            throw new NumberFormatException("Please enter the number!");
        }
    }
}
