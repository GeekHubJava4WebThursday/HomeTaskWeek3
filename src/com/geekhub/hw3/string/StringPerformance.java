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

        String someString = "";

        for(int i = 0; i <= CONCAT_CYCLES; i++){
            someString = someString + "i=" + i;
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("Test String: string concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i <= CONCAT_CYCLES; i++){
            stringBuilder.append("i = " + i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("Test StringBuilder: string concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i <= CONCAT_CYCLES; i++){
            stringBuffer.append("i = " + i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("Test StringBuffer string concatenation took " + timePastMs + "ms");
    }
}
