package com.practice.sliding;

public class minSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        for(int i = 0, j = i+1; i < nums.length ; i++) {
            if(nums[i] >= target) {
                return 1;
            }
            if(nums[i] + nums[j] > target) {

            }
        }

        return result;
    }
}
