package org.ptkl.search.binary.finduplicate;

/**
 * leetcode 287 寻找重复数
 */
public class Solution {

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        /**
         * 数组长度为n，则数字范围在[1,n-1]之间
         */
        int left = 1;
        int right = n-1;
        while (left < right) {
            int mid = (left+right)/2;
            int cnt = 0;
            for (int t : nums) {
                if (t <= mid) {
                    cnt++;
                }
            }
            if (cnt > mid) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
