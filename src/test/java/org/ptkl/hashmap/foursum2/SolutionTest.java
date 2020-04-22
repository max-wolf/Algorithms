package org.ptkl.hashmap.foursum2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = null;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFourSumCount() {
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0, 2};
        System.out.println(solution.fourSumCount(A,B,C,D));
    }
}