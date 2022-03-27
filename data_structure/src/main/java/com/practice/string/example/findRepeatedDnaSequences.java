package com.practice.string.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findRepeatedDnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        if(s.length() <= 10) {
            return result;
        }
        Map<String,Integer> dict = new HashMap<String,Integer>();
        for(int i = 0; i <= s.length() - 10 ; i++) {
            if(dict.containsKey(s.substring(i,i+10)) && dict.get(s.substring(i,i+10)) == 1) {
                result.add(s.substring(i,i+10));
                dict.put(s.substring(i,i+10),0);
            }
            if (!dict.containsKey(s.substring(i,i+10))){
                dict.put(s.substring(i,i+10),1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        findRepeatedDnaSequences("AAAAAAAAAAA");
    }
}
