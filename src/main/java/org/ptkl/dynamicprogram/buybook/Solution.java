package org.ptkl.dynamicprogram.buybook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/*
编程之美 买书问题
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fun(2, 2, 2, 1, 1));
    }

    public double fun(int... args) {
        Arrays.sort(args);
        int a = args[0];
        int b = args[1];
        int c = args[2];
        int d = args[3];
        int e = args[4];

        if (a > 0) {
            return min(5 * 8 * 0.75 + fun(a - 1, b - 1, c - 1, d - 1, e - 1),
                    4 * 8 * 0.8 + fun(a, b - 1, c - 1, d - 1, e - 1),
                    3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (a == 0 && b > 0) {
            return min(4 * 8 * 0.8 + fun(a, b - 1, c - 1, d - 1, e - 1),
                    3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (b == 0 && c > 0) {
            return min(3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (c == 0 && d > 0) {
            return min(2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (d == 0 && e > 0) {
            return 8 + fun(a, b, c, d, e - 1);
        } else {
            return 0;
        }
    }

    public double min(double... arr) {
        return Arrays.stream(arr).min().orElse(Double.MAX_VALUE);
    }
}
