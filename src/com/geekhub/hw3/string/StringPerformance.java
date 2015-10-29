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

        String string = new String("X");
        for (int j = 0; j <CONCAT_CYCLES; j++) {
            string.concat("Y");
        }

            long timePastMs = System.currentTimeMillis() - beginTime;
            System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        //TODO: Implement similar to testStringPerformance
        long beginTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("X");
        for (int j = 0; j <CONCAT_CYCLES; j++) {
            stringBuilder.append("Y");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        //TODO: Implement similar to testStringPerformance
        long beginTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("X");
        for (int j = 0; j <CONCAT_CYCLES; j++) {
            stringBuffer.append("Y");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }
}
