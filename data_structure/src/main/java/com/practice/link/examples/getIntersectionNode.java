package com.practice.link.examples;

import com.practice.array.examples.ListNode;

import java.util.HashSet;
import java.util.Set;

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        Set<Integer> setB = new HashSet<Integer>();
        while(headB != null) {
            setB.add(headB.val());
            headB = headB.next();
        }

        while(headA != null) {
            if(setB.contains(headA.)) {
                return headA;
            }else{
                headA = headA.getNext();
            }
        }

        return null;
    }
}
