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

    public int[] heapSort(int[] array) {
        int len = array.length;
        buildMaxHeap(array,len);
        for(int i = len -1 ; i> 0; i--){
            swap(array,0,1);
            len--;
            heapify(array,0,len);
        }
        return array;
    }

    private void buildMaxHeap(int[] array ,int length) {
        for(int i = (int) Math.floor(length/2); i >=0; i-- ) {
            heapify(array,i,length);
        }
    }

    private void heapify(int[] arr, int i, int len) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;

        if(left < len && arr[left] > arr[len]) {
            largest = len;
        }

        if(right < len && arr[right] > arr[len]) {
            largest = len;
        }

        if(largest != i) {
            swap(arr,i,largest);
            heapify(arr,largest,len);
        }
    }

    private void swap (int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
