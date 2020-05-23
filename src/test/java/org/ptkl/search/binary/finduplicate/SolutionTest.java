package org.ptkl.search.binary.finduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDuplicate() {
        Solution solution = new Solution();
        int[] a = {1, 2, 2, 3, 4, 5, 6, 7};
        System.out.println(solution.findDuplicate(a));
    }
}