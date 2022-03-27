package com.practice.twoPointers;

import java.util.Stack;

public class backspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        String a_final = backspace(s);
        String b_final = backspace(t);
        return a_final.equals(b_final);
    }

    String backspace(String s) {
        String result = new String();
        Stack<Character> s_stack = new Stack<>();
        for(int i = 0; i < s.toCharArray().length ; i++) {
            if(s_stack.empty() && s.toCharArray()[i] == '#') {
                continue;
            }
            if(s.toCharArray()[i] == '#') {
                s_stack.pop();
            }else {
                s_stack.push(s.toCharArray()[i]);
            }
        }
        while(!s_stack.empty()) {
            result += s_stack.pop();
        }
        return result;
    }
}
