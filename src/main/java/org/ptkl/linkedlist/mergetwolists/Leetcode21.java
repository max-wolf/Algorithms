package org.ptkl.linkedlist.mergetwolists;

/**
 * leetcode 21. 合并两个有序链表
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Leetcode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode t = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                t.next = l1;
                l1 = l1.next;
            } else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }
        t.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
