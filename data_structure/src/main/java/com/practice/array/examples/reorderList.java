package com.practice.array.examples;

import java.util.Stack;

public class reorderList {
    public void reorderList(ListNode head) {
        if(head == null) {
            return;
        }
        ListNode curr = head;
        Stack<ListNode> nodeStack = convert2ListNode(head);
        while(nodeStack.peek() != curr) {
            ListNode last = nodeStack.pop();
            last.setNext(head.getNext());
            curr.setNext(last);
            curr = curr.getNext();
        }
    }

    Stack<ListNode> convert2ListNode (ListNode head) {
        Stack<ListNode> nodeStack = new Stack<ListNode>();
        ListNode curr = head;
        while(curr != null) {
            nodeStack.push(curr);
            curr = curr.getNext();
        }
        return nodeStack;
    }
}
