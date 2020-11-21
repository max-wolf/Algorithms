package org.ptkl.twopoint;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 9. 回文数
 */
public class Leetcode9 {
    //每一位数字放入list，双指针遍历
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int t;
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            t = x % 10;
            x = x / 10;
            list.add(t);
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //翻转一半数字，与原始数字另一半比较
    public boolean isPalindrome1(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int t=0;
        while (x > t) {
            t = x % 10 + t * 10;
            x/=10;
        }
        return x == t || x == t / 10;
    }
}
