package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 1000000;
    private static final String CONCAT_TEXT = "text";

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        String result = "";
        long beginTime = System.currentTimeMillis();

        for(int i = 0; i < CONCAT_CYCLES; i++) {
            result = result.concat(CONCAT_TEXT);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        StringBuilder stringBuilder = new StringBuilder();
        long beginTime = System.currentTimeMillis();

        for(int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuilder.append(CONCAT_TEXT);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuilder took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        StringBuffer stringBuffer = new StringBuffer();
        long beginTime = System.currentTimeMillis();

        for(int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuffer.append(CONCAT_TEXT);
        }
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuffer took " + timePastMs + "ms");
    }
}
