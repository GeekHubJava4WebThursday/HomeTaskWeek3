package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 1000000;

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        long beginTime = System.currentTimeMillis();

        //TODO: Do CONCAT_CYCLES times of string concatenation
        String test = "test text";
        for (int i = 0; i < CONCAT_CYCLES; i++)
        {
            test += test;
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        //TODO: Implement similar to testStringPerformance
    }

    private static void testStringBufferPerformance() {
        //TODO: Implement similar to testStringPerformance
    }
}
