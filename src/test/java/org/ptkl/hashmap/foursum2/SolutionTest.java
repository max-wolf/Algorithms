package org.ptkl.hashmap.foursum2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolutionTest {

    Logger logger = LoggerFactory.getLogger(SolutionTest.class);
    Solution solution = new Solution();

    @Test
    void fourSumCount() {
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0, 2};
        int res = solution.fourSumCount(A,B,C,D);
        logger.info("result is {}",res);
    }
}