package org.ptkl.dynamicprogram.maximalsquare;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Leetcode221Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode221 leetcode221 = new Leetcode221();

    @Test
    void maximalSquare() {
        char matrix[][] = {
//                {'1','0','1','0','0'},
//                {'1','0','1','1','1'},
//                {'1','1','1','1','1'},
//                {'1','0','0','1','0'}
        };

        logger.info(String.valueOf(leetcode221.maximalSquare(matrix)));
    }
}