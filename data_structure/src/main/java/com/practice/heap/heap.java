package com.practice.heap;

/**
 *  堆 就是用 数组实现的二叉树
 *  堆的特性：最大堆的父节点的值比子节点都要大，最小堆的父节点的值比子节点都要小
 *  常用函数有
 *  1. 构建优先队列，可以快速找到 最重要 的元素
 *  2. 支持堆排序
 *  3. 快速找出一个集合的最小值
 *
 *  堆和普通树的区别
 *
 */
public class heap {
    private  static final int DEFAULT_CAPACITY = 100;

    private Comparable[] items;
    private int currentSize;

    public heap() {
//        this(DEFAULT_CAPACITY);
    }

    public heap(Comparable[] items) {
        items = new Comparable[DEFAULT_CAPACITY];
        this.currentSize = 0;
    }
}
