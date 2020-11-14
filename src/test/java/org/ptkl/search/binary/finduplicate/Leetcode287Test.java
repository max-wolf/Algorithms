package org.ptkl.search.binary.finduplicate;

import org.junit.jupiter.api.Test;

class Leetcode287Test {

    @Test
    void findDuplicate() {
        Leetcode287 leetcode287 = new Leetcode287();
        int[] a = {1, 2, 2, 3, 4, 5, 6, 7};
        System.out.println(leetcode287.findDuplicate(a));
    }
}