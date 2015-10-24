package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 10000;
    private static final String base = "We have many liters of juice.\n";
    private static final String tail = "We drank a liter of juice.\n";

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        String result = base;

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            result += tail;
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        StringBuilder stringBuilder = new StringBuilder(base);

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuilder.append(tail);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuilder concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        StringBuffer stringBuffer = new StringBuffer(base);

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuffer.append(tail);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuffer concatenation took " + timePastMs + "ms");
    }

}
