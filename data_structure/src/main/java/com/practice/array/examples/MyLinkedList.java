package com.practice.array.examples;

public class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        this.size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }

        ListNode curr = head;
        for(int i = 0; i < index ; i++) curr = curr.next;
        return curr.getVal();
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        ListNode curr = head;
        for(int i = 0; i < index ; i++) {
            curr = curr.next;
        }
        ListNode tmp = curr.getNext();
        ListNode newNode = new ListNode(val);
        newNode.setNext(tmp);
        curr.setNext(newNode);
    }

    public void deleteAtIndex(int index) {
        ListNode curr = head;
        for(int i = 0; i < index-1 ; i++) {
            curr = curr.next;
        }
        curr.setNext(curr.getNext().getNext());
    }
}
