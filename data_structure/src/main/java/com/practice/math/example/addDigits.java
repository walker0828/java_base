package com.practice.math.example;

public class addDigits {
    public int addDigits(int num) {
        int result = num;
        while(result > 9) {
            result = getAddDigits(result);
        }
        return result;
    }

    private int getAddDigits(int num) {
        int addResult = 0;
        while(num > 9) {
            addResult += num % 10;
            num = num/10;
        }
        return addResult+num;
    }
}
