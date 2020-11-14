package org.ptkl.hashmap.foursum2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leetcode454Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode454 leetcode454 = new Leetcode454();

    @Test
    void fourSumCount() {
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0, 2};
        int res = leetcode454.fourSumCount(A,B,C,D);
        logger.info("result is {}",res);
    }
}