package com.practice.array.examples;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int num : nums) {
            single ^= num;
        }
        return single;
    }
}
