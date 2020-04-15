package org.ptkl.sort.shellsort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        int[] arr2 = arr;
        int[] arr3 = arr;
        shellsort1(arr);
        System.out.println(Arrays.toString(arr));

        shellsort2(arr2);
        System.out.println(Arrays.toString(arr2));

        shellsort3(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    static void shellsort1(int[] a) {
        int n = a.length;
        for(int d = n/2; d >= 1; d /= 2) {
            for(int i = 0; i < d; i++) {
                for(int j = i+d; j < n; j += d) {
                    if(a[j] < a[j-d]) {
                        int tmp = a[j];
                        a[j] = a[j-d];
                        int k = j-d;
                        for(; k>i; k-=d) {
                            if(tmp < a[k-d]) a[k] = a[k-d];
                            else break;
                        }
                        a[k] = tmp;
                    }
                }
            }
        }
    }

    static void shellsort2(int[] a) {
        int n = a.length;
        for(int d = n/2; d > 0; d /= 2) {
            for(int i = d; i < n; i++) {
                if(a[i] < a[i-d]) {
                    int tmp = a[i];
                    a[i] = a[i-d];
                    int k = i-d;
                    for(; k >= d; k -= d) {
                        if(tmp < a[k-d]) a[k] = a[k-d];
                        else break;
                    }
                    a[k] = tmp;
                }
            }
        }
    }

    static void shellsort3(int[] a) {
        int n = a.length;
        for(int d = n/2; d > 0; d /= 2) {
            for(int i = d; i < n; i++) {
                for(int k = i; k - d >= 0 && a[k] < a[k - d]; k -= d) {
                    int t;
                    t = a[k];
                    a[k] = a[k-d];
                    a[k-d] = t;
                }
            }
        }
    }
}
