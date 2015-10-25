package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 1000000;

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        String string="";
        long beginTime = System.currentTimeMillis();

        //TODO: Do CONCAT_CYCLES times of string concatenation
        for (int i = 0; i < CONCAT_CYCLES ;i++){
            string.concat("abcdefgabcdefgabcdefgabcdefgabcdefgabcdefg");
        }
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        StringBuilder stringBuilder = new StringBuilder("");
        long beginTime = System.currentTimeMillis();
        //TODO: Implement similar to testStringPerformance
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuilder.append("abcdefgabcdefgabcdefgabcdefgabcdefgabcdefg");
        }
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        StringBuffer stringBuffer = new StringBuffer("");
        long beginTime = System.currentTimeMillis();
        //TODO: Implement similar to testStringPerformance
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            stringBuffer.append("abcdefgabcdefgabcdefgabcdefgabcdefgabcdefg");
        }
        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }
}
