package org.ptkl.linkedlist.addtwonum;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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

        ListNode res = solution.addTwoNumbers(l1, l2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    // 输入[5],[5],输出[0,1]
    @Test
    public void test5Add5() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode res = solution.addTwoNumbers(l1, l2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}