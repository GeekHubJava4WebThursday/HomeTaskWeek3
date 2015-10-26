package com.geekhub.hw3.utility;

public class TestString {

    public static long getConcatTime(StringType stringType, long iterationCount, String appendString) {
        String string = "";
        StringBuilder stringBuilder = new StringBuilder("");
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            switch (stringType) {
                case STRING:
                    string = string + appendString;
                    break;
                case STRING_CONCAT:
                    string = string.concat(appendString);
                    break;
                case STRING_BUILDER:
                    stringBuilder = stringBuilder.append(appendString);
                    break;
                case STRING_BUFFER:
                    stringBuffer = stringBuffer.append(appendString);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown string type!");
            }
        }
        return System.currentTimeMillis() - start;
    }

    public static void testStringConcatPerformance(long iterationCount, String appendString) {
        if (iterationCount < 1) {
            throw new IllegalArgumentException("Iteration count must be positive!");
        }
        if (appendString.length() < 1) {
            throw new IllegalArgumentException("Append string is empty!");
        }

        System.out.println("String test processing ...");
        System.out.println("Time for String (+): "
                + TestString.getConcatTime(StringType.STRING, iterationCount, appendString) + "ms");
        System.out.println("Time for String (concat): "
                + TestString.getConcatTime(StringType.STRING_CONCAT, iterationCount, appendString) + "ms");
        System.out.println("StringBuffer processing ...");
        System.out.println("Time for StringBuff1er (append): "
                + TestString.getConcatTime(StringType.STRING_BUFFER, iterationCount, appendString) + "ms");
        System.out.println("StringBuilder processing ...");
        System.out.println("Time for StringBuilder (append): "
                + TestString.getConcatTime(StringType.STRING_BUILDER, iterationCount, appendString) + "ms");
    }
}
