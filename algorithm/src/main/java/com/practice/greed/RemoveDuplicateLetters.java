package com.practice.greed;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];
        int[] nums = new int[26];
        for(int i=0; i< s.length() ; i++) {
            nums[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!vis[ch-'a']) {
                while(sb.length() > 0 && sb.charAt(sb.length()-1) > ch) {

                }
            }

        }
        return "";
    }
}
