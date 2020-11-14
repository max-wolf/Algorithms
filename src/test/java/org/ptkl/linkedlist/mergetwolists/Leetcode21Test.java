package org.ptkl.linkedlist.mergetwolists;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode21Test {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode21 leetcode21 = new Leetcode21();

    @Test
    public void testMergeTwoLists() {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(1);
        ListNode h2 = l2;
        h2.next = new ListNode(3);
        h2 = h2.next;
        h2.next = new ListNode(4);

        ListNode res = leetcode21.mergeTwoLists(l1, l2);
        while(res != null) {
            logger.info("{}",res.val);
            res = res.next;
        }
    }
}