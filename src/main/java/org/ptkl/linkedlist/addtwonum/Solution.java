package org.ptkl.linkedlist.addtwonum;

/*
 * leetcode 2.两数相加
 * */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode p = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int c = 0; //进位
        while(p1 != null && p2 != null) {
            int t = p1.val + p2.val + c;
            if(t > 9) {
                p.next = new ListNode(t%10);
                c = 1;
            } else {
                p.next = new ListNode(t);
                c = 0;
            }
            p = p.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 != null) {
            mergeList(p, p1, c);
        } else if(p2 != null) {
            mergeList(p, p2, c);
        } else if(c == 1) {
            // 两链表长度相等时进位
            p.next = new ListNode(1);
        }
        return head.next;
    }

    /**
     * 合并链表
     * @param p
     * @param l
     * @param c
     * @return
     */
    public void mergeList(ListNode p, ListNode l, int c) {
        while(l != null) {
            int t = l.val + c;
            if(t > 9) {
                p.next = new ListNode(t%10);
                c = 1;
            } else {
                p.next = new ListNode(t);
                c = 0;
            }
            p = p.next;
            l = l.next;
        }
        if(c == 1) {
            p.next = new ListNode(1);
        }
    }
}
