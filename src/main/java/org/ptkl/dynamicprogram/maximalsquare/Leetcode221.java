package org.ptkl.dynamicprogram.maximalsquare;

/**
 * leetcode 221. 最大正方形
 */
public class Leetcode221 {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int dp[][] = new int[rows][columns];
        int maxSideLength = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j]=0;
                } else {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                    }
                }
                maxSideLength = Math.max(dp[i][j],maxSideLength);
            }
        }
        return maxSideLength*maxSideLength;
    }
}
