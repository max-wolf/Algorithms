package org.ptkl.dynamicprogram.maximalrectangle;

import org.ptkl.stack.largestrectanglearea.Leetcode84;

/**
 * leetcode 85. 最大矩形
 * 类似柱状图最大矩形leetcode84
 */
public class Leetcode85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows=matrix.length, columns=matrix[0].length;
        int[] heights = new int[columns];
        int res=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                heights[j]= matrix[i][j]=='1'?heights[j]+1:0;
            }
            res = Math.max(res, new Leetcode84().largestRectangleArea1(heights));
        }
        return res;
    }
}
