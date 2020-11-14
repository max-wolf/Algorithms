package org.ptkl.sort.countingsort;

/**
 * leetcode 274. H 指数
 */
public class Leetcode274 {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] t = new int[n + 1];
        for (int c : citations) {
            t[Math.min(c, n)]++;
        }
        int k = n;
        for (int i = 0; i < n + 1; i++) {
            if (k > i) {
                k = k - t[i];
            } else if (k == i) {
                return i;
            } else {
                return i-1;
            }
        }
        return 0;
    }

}
