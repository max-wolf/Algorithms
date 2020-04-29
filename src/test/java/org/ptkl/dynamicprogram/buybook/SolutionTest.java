package org.ptkl.dynamicprogram.buybook;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Logger logger = LoggerFactory.getLogger(SolutionTest.class);
    Solution solution = new Solution();

    @Test
    void fun() {
        double res = solution.fun(2, 2, 2, 1, 1);
        logger.info("result is {}", res);
    }
}