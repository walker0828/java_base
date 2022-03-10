package com.practice.greed;

public class canJump {
    /**
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * 判断你是否能够到达最后一个下标。
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightMost = 0;
        for(int i = 0; i< n ; i++) {
            if( i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if(rightMost >= n -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        jump(new int[]{1,2,3,4,5});
    }
}
