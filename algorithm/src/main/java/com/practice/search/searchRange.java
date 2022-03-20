package com.practice.search;

public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int index = nums.length / 2;
        while(index >= 0 && index < nums.length && nums[index] != target) {
            if(nums[index] > target) {
                index = index / 2;
            }else{
                index = (nums.length - index) / 2;
            }
        }
        return getResult(index,nums);
    }

    private int[] getResult(int index, int[] nums) {
        int start = index ;
        int end = index;
        while(nums[start] == nums[index] && start >=0) {
            start = start -1;
        }
        while(nums[end] == nums[index] && start < nums.length) {
            end = end + 1;
        }
        return new int[] {start+1, end -1};
    }

    public int search(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++ ){
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        return false;
    }
}
