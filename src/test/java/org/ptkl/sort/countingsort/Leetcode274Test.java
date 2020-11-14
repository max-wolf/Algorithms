package org.ptkl.sort.countingsort;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

class Leetcode274Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode274 leetcode274 = new Leetcode274();

    @Test
    void hIndex() {
        int[] a = {1, 3, 2, 3, 50};
        int s = leetcode274.hIndex(a);
        logger.info(Arrays.toString(a));
        logger.info(String.valueOf(s));

        a = new int[]{1, 1};
        s = leetcode274.hIndex(a);
        logger.info(Arrays.toString(a));
        logger.info(String.valueOf(s));
    }
}