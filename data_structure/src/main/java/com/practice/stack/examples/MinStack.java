package com.practice.stack.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    int size;
    Stack<Integer> minStack;
    List<Integer> myStack;

    public MinStack() {
        this.size = 0;
        this.minStack = new Stack<Integer>();
        myStack = new ArrayList<Integer>();
    }

    public void push(int val) {
        myStack.add(val);
        this.size++;
    }

    public void pop() {
        if(myStack.size() > 0 ) {
            if(minStack.peek() == this.myStack.get(size-1)) {
                minStack.pop();
            }
            this.myStack.remove(size-1);
            this.size--;
        }
    }

    public int top() {
        if(myStack.size() > 0) {
            return this.myStack.get(size-1);
        }
        return -1;
    }

    public int getMin() {
        return minStack.pop();
    }
}
