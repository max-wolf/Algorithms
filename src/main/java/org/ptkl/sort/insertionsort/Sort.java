package org.ptkl.sort.insertionsort;

import java.util.Arrays;

public class Sort {
    static void insertSort(int[] a) {
        int n = a.length;
        for(int i = 1; i < n; i++) {
            if(a[i] < a[i - 1]) {
                int tmp = a[i];
                a[i] = a[i - 1];
                int j = i - 1;
                for(; j > 0; j--) {
                    if(tmp < a[j - 1]) a[j] = a[j - 1];
                    else break;
                }
                a[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {49,38,65,97,76,13,27,49};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}

