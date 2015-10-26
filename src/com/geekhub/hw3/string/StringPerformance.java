package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 100000;

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        long beginTime = System.currentTimeMillis();

        String blankString = "";

        for(int i = 0;i<CONCAT_CYCLES;i++) {
            blankString += i;
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuilder blankBuilder = new StringBuilder();

        for(int i = 0;i<CONCAT_CYCLES;i++) {
            blankBuilder.append(i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuilder concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuffer blankBuffer = new StringBuffer();

        for(int i = 0;i<CONCAT_CYCLES;i++) {
            blankBuffer.append(i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuffer concatenation took " + timePastMs + "ms");
    }
}
