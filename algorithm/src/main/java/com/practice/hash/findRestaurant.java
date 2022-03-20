package com.practice.hash;

import java.util.*;

public class findRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> dict = new HashMap<String, Integer>();
        for(int index = 0; index < list1.length; index++) {
            dict.put(list1[index],index);
        }
        List<String> result = new ArrayList<String>();
        for(String l2 : list2) {
            if(dict.containsKey(l2)) {
                result.add(l2);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
