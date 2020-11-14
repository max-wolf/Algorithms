package org.ptkl.twopoint;

/**
 * leetcode 11. 盛最多水的容器
 */
public class Leetcode11 {

    public int maxArea(int[] height) {
        if (height == null) {
            return 0;
        }
        int len=height.length;
        int i=0,j=len-1;
        int res=0;
        while (i < j) {
            int tmp = Math.min(height[i], height[j]) * (j - i);
            res = Math.max(tmp, res);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return res;
    }
}
