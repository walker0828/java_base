package com.practise.stack;

/**
 * 栈 先进后出，由数组构成
 * 常用方法：
 * 1. empty 是否为空
 * 2. push 压入栈
 * 3. pop 推出栈
 * 4. peek 取顶上的元素
 * 5. search 搜索对象在栈中的索引
 */
public class Stack<T> {
    private Object[] items;
    private int currentSize = 0;
    private final static int DEFAULT_CAPACITY = 8;

    public Stack() {
        items = new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void push(T t) {
        items[currentSize] = t;
        currentSize++;
    }

    public T pop() {
        return (T) items[--currentSize];
    }

    public T peek() {
        return (T) items[currentSize-1];
    }

}
