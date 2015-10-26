package com.geekhub.hw3.utility;

public class Parser {

    /**
     * @param str - only numerals, can't start with 0,
     * @return Integer number parsed from "str" param
     * @throws NumberFormatException
     */
    public static Integer parseInt(String str) throws NumberFormatException {

        if (str.charAt(0) == '0') {
            throw new NumberFormatException("Param can't start with 0!");
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                throw new NumberFormatException("String contains non-digit symbol!");
            }
        }

        // TODO: implement parseInt method
        return Integer.parseInt(str);
    }


}
