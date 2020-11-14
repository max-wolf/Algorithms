package org.ptkl.dynamicprogram.buybook;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BeautyOfProgramming1_4Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    BeautyOfProgramming1_4 beautyOfProgramming14 = new BeautyOfProgramming1_4();

    @Test
    void fun() {
        double res = beautyOfProgramming14.fun(2, 2, 2, 1, 1);
        logger.info("result is {}", res);
    }
}