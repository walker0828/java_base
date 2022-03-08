package com.practice.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        if(s == null || s.length() == 0 ){
            return result;
        }
        if(s.length() == 1) {
            return 1;
        }
        boolean isBreak;
        List<Character> temp = new ArrayList<Character>();
        for(int i =0; i < s.toCharArray().length-1 ; i++) {
            temp.add(s.charAt(i));
            isBreak = true;
            int j = i+1;
            while(j < s.toCharArray().length && isBreak) {
                if(temp.contains(s.charAt(j))) {
                    result = Math.max(j, result);
                    j = 0;
                    temp.clear();
                    isBreak = false;
                }else{
                    temp.add(s.charAt(j));
                    j++;
                }
            }
            result = Math.max(j, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
    }
}
