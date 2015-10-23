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

        String string = "";
        for (int i = 0; i <= CONCAT_CYCLES; i++) {
            string += "text";
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + " ms"); //Result: 4296085 ms
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i <= CONCAT_CYCLES; i++) {
            stringBuilder.append("text");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + " ms"); //Result: 69 ms
    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i <= CONCAT_CYCLES; i++) {
            stringBuffer.append("text");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + " ms"); //Result: 62 ms
    }
}
