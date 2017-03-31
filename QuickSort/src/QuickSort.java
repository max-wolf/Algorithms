
import java.util.*;

public class QuickSort {
    static public int partition(int[] arr, int l, int r) {
        int tmp = arr[l];
        int i = l;
        int j = r;
        while(i < j) {
            while (tmp < arr[j] && i < j)
                j--;
            arr[i] = arr[j];
            while (tmp > arr[i] && i < j)
                i++;
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        return i;
    }

    static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            int i = partition(arr, l, r);
            quickSort(arr, l, i-1);
            quickSort(arr, i+1, r);
        }
    }

    static void quickSort_nonRec(int[] arr, int l, int r) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        if(l < r) {
            stack.push(r);
            stack.push(l);
            while(!stack.isEmpty()) {
                int i = stack.pop();
                int j = stack.pop();
                int mid = partition(arr, i, j);
                if(i < mid - 1) {
                    stack.push(mid - 1);
                    stack.push(i);
                }
                if(mid + 1 < j) {
                    stack.push(j);
                    stack.push(mid + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 3, 6, 7, 1, 5};
        quickSort_nonRec(arr, 0, arr.length-1);
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
