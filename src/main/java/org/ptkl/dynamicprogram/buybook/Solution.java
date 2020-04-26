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
        System.out.println(solution.fun(2,2,2,1,1));
    }

    public double fun(int a, int b, int c, int d, int e) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.sort(Integer::compareTo);
        a = list.get(0);
        b = list.get(1);
        c = list.get(2);
        d = list.get(3);
        e = list.get(4);

        if (a > 0) {
            return min(5 * 8 * 0.75 + fun(a - 1, b - 1, c - 1, d - 1, e - 1),
                    4 * 8 * 0.8 + fun(a, b - 1, c - 1, d - 1, e - 1),
                    3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (a == 0 && b > 0) {
            return min(Double.MAX_VALUE,
                    4 * 8 * 0.8 + fun(a, b - 1, c - 1, d - 1, e - 1),
                    3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (a == 0 && b == 0 && c > 0) {
            return min(Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    3 * 8 * 0.9 + fun(a, b, c - 1, d - 1, e - 1),
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (a == 0 && b == 0 && c == 0 && d > 0) {
            return min(Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    2 * 8 * 0.95 + fun(a, b, c, d - 1, e - 1),
                    8 + fun(a, b, c, d, e - 1));
        } else if (a == 0 && b == 0 && c == 0 && d == 0 && e > 0) {
            return min(Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    Double.MAX_VALUE,
                    8 + fun(a, b, c, d, e - 1));
        } else {
            return 0;
        }
    }

    public double min(double a, double b, double c, double d, double e) {
        double[] list = {a, b, c, d, e};
        return Arrays.stream(list).min().getAsDouble();
    }
}
