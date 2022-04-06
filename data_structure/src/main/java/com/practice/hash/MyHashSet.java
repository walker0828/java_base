package com.practice.hash;

import java.util.LinkedList;

public class MyHashSet {
    private static final int BASE = 769;
    private LinkedList[] data;

    public MyHashSet() {
        for(int i = 0; i< BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int key_hash = hash(key);

    }

    public void remove(int key) {

    }

    public boolean contains(int key) {

    }

    private static int hash(int key) {
        return key % BASE;
    }

}
