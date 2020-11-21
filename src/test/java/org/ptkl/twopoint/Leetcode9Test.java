package org.ptkl.twopoint;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode9Test {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    Leetcode9 leetcode9=new Leetcode9();

    @Test
    void isPalindrome() {
        System.out.println(leetcode9.isPalindrome(1221));//true
        System.out.println(leetcode9.isPalindrome(121));//true
        System.out.println(leetcode9.isPalindrome(-1221));//false
        System.out.println(leetcode9.isPalindrome(101));//true
    }

    @Test
    void isPalindrome1() {
        System.out.println(leetcode9.isPalindrome1(1221));//true
        System.out.println(leetcode9.isPalindrome1(121));//true
        System.out.println(leetcode9.isPalindrome1(-1221));//false
        System.out.println(leetcode9.isPalindrome1(101));//true
    }
}