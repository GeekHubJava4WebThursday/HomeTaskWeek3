package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 10000;

    public static void main(String[] args) {
        testStringPerformance(); //
        testStringBuilderPerformance();
        testStringBufferPerformance();

      /* Output
        String concatenation took 869ms
        StringBuilder concatenation took 1ms
        StringBuffer concatenation took 1ms
        */
    }

    private static void testStringPerformance() {
        long beginTime = System.currentTimeMillis();
        String c = new String("Start");

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            c += "Hello World";
        }
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Start");

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuilder.append("Hello world");
        }
        String end = stringBuilder.toString();
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuilder concatenation took " + timePastMs + "ms");

    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Start");

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuffer.append("Hello world");
        }
        String end = stringBuffer.toString();
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuffer concatenation took " + timePastMs + "ms");
    }
}
