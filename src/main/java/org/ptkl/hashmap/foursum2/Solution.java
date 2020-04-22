package org.ptkl.hashmap.foursum2;

import java.util.HashMap;
import java.util.Map;

/*
* leetcode 454.四数相加II
* */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = A.length;
        int result = 0;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                int sum = A[i] + B[j];
                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                int sum = -(C[i] + D[j]);
                if(map.containsKey(sum)) {
                    result += map.get(sum);
                }
            }
        }
        return result;
    }
}