package com.practice.array.examples;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

/**
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库的sort函数的情况下解决这个问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class sortColors {
    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        for(int i = 0, j= nums.length-1 ; i<nums.length; i++) {
            if(nums[i] == 0) {
                swap(nums,l,i);
                l++;
            }else if(nums[i] == 2){
                swap(nums,r,i);
                r--;
            }
        }
    }

    private static void swap(int[] nums,int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,2,2,2,1,1,1,1,0,0,0,0,0});
    }
}
