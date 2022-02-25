package com.practice.string.example;

public class titleToNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        char[] columnChars = columnTitle.toCharArray();
        if(columnChars.length == 0) {
            return result;
        }

        for(int i = columnChars.length -1 ; i >= 0; i--) {
            int temp = (columnChars[i] - 'A' + 1);
            result += (columnChars[i] - 'A' + 1) * Math.pow(26, columnChars.length - i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        titleToNumber("ABC");
    }
}
