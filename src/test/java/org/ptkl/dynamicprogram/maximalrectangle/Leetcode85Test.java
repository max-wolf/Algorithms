package org.ptkl.dynamicprogram.maximalrectangle;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode85Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode85 leetcode85 = new Leetcode85();

    @Test
    void maximalRectangle() {
        char matrix[][] = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        logger.info(String.valueOf(leetcode85.maximalRectangle(matrix)));
    }
}