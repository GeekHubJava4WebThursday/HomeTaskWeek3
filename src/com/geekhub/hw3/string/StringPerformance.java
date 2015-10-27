package com.geekhub.hw3.string;

/**
 * Comparison of productivity methods concatenation String, StringBuffer and StringBuilder.
 */
public class StringPerformance {

    private static final int CONCAT_CYCLES = 100000;

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        long beginTime = System.currentTimeMillis();
        String s1 = "";
        String s2 = "test";


        for (int i = 0; i<=CONCAT_CYCLES; i++){
            s1 = s1 + s2;
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();
        StringBuilder s1 = new StringBuilder("");
        String s2 = "test";

        for (int i = 0; i<=CONCAT_CYCLES; i++){
            s1 = s1.append(s2);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();
        StringBuffer s1 = new StringBuffer("");
        String s2 = "test";

        for (int i = 0; i<=CONCAT_CYCLES; i++){
            s1 = s1.append(s2);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

}
