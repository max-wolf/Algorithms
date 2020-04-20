package org.ptkl.hashmap.foursum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fourSumCount() {
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0, 2};
        System.out.println(fourSumCount(A,B,C,D));
    }
}