package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 1000000;

    public static void main(String[] args) {
      test();
    }

    private static void test() {

        int[] timeArray = new int[3];

        for (int i = 0; i < 100; i++) {

            long string = testStringPerformance();
            long stringBuilder = testStringBuilderPerformance();
            long stringBuffer = testStringBufferPerformance();

            if (string < stringBuilder && string < stringBuffer) {
                timeArray[0]++;
            } else if (stringBuilder < stringBuffer) {
                timeArray[1]++;
            } else {
                timeArray[2]++;
            }
        }

        System.out.println("String best performance        : " + timeArray[0]);
        System.out.println("StringBuilder best performance : " + timeArray[1]);
        System.out.println("StringBuffer best performance  : " + timeArray[2]);
    }

    private static long testStringPerformance() {
        long beginTime = System.currentTimeMillis();

        String testString = new String();
        //TODO: Do CONCAT_CYCLES times of string concatenation
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            testString.concat(String.valueOf(i));
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        //System.out.println("String concatenation took " + timePastMs + " ms.");
        return timePastMs;
    }

    private static long testStringBuilderPerformance() {
        //TODO: Implement similar to testStringPerformance
        long beginTime = System.currentTimeMillis();

        StringBuilder testStringBuilder = new StringBuilder();

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            testStringBuilder.append(i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        //System.out.println("String builder appending took " + timePastMs + " ms.");
        return timePastMs;
    }

    private static long testStringBufferPerformance() {
        //TODO: Implement similar to testStringPerformance
        long beginTime = System.currentTimeMillis();

        StringBuffer testStringBuffer = new StringBuffer();

        for (int i = 0; i < CONCAT_CYCLES; i++) {
            testStringBuffer.append(i);
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        //System.out.println("String buffer appending took " + timePastMs + " ms.");
        return timePastMs;
    }
}
