package com.practice.array.examples;

import java.util.Arrays;

public class missingNumber {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        if(max == 1) {
            return nums[0] == 0 ? 1:0;
        }
        Arrays.sort(nums);
        if(nums[0] != 0) {
            return 0;
        }
        for(int i = 0; i< max-1 ; i++) {
            if(nums[i+1] - nums[i] > 1) {
                return nums[i] + 1;
            }
        }
        return max;
    }
}
