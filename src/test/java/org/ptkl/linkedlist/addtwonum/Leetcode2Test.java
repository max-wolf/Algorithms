package org.ptkl.linkedlist.addtwonum;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leetcode2Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode2 leetcode2 = new Leetcode2();

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        ListNode h1 = l1;
        h1.next = new ListNode(4);
        h1 = h1.next;
        h1.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        ListNode h2 = l2;
        h2.next = new ListNode(6);
        h2 = h2.next;
        h2.next = new ListNode(4);
        h2 = h2.next;
        h2.next = new ListNode(9);

        ListNode res = leetcode2.addTwoNumbers(l1, l2);
        while(res != null) {
            logger.info("{}",res.val);
            res = res.next;
        }
    }

    // 输入[5],[5],输出[0,1]
    @Test
    public void test5Add5() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode res = leetcode2.addTwoNumbers(l1, l2);
        while(res != null) {
            logger.info("{}",res.val);
            res = res.next;
        }
    }
}