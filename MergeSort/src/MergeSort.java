import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] a, int l, int m, int r) {
		int[] tmp = new int[r-l+1];
		int i = l, j = m+1, k = 0;
		while(i <= m && j <= r) {
			if(a[i] < a[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = a[j++];
		}
		while(i <= m)
			tmp[k++] = a[i++];
		while(j <= r)
			tmp[k++] = a[j++];
		for(int t = 0; t < r-l+1; t++)
			a[l+t] = tmp[t];
	}
	
	public static void mergeSort(int[] a, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			merge(a, l, m, r);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		mergeSort(a, 0, a.length-1);
	}
}
