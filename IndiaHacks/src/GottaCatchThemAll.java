import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class GottaCatchThemAll {

	//Arranging them in descending order for the least number of days
	public static int pivot(int[] a, int lo, int hi){
		int mid = (lo+hi)/2;
		int pivot = a[lo] + a[hi] + a[mid] - Math.min(Math.min(a[lo], a[hi]), a[mid]) - Math.max(Math.max(a[lo], a[hi]), a[mid]);
		
		if(pivot == a[lo])
			return lo;
		else if(pivot == a[hi])
			return hi;
		return mid;
	}

	public static int partition(int[] a, int lo, int hi){
		
		int k = pivot(a, lo, hi);
		swap(a, lo, k);
		int j = hi + 1;
		int i = lo;
		while(true){
			
			while(a[lo] < a[--j])
				if(j==lo)	break;
			
			while(a[++i] < a[lo])
				if(i==hi) break;
			
			if(i >= j)	break;
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}
	
	public static void sort(int[] a, int lo, int hi){
		if(hi<=lo)	return;
		int p = partition(a, lo, hi);
		sort(a, lo, p-1);
		sort(a, p+1, hi);
	}
	
	public static void swap(int[] a, int b, int c){
		int swap = a[b];
		a[b] = a[c];
		a[c] = swap;
	}
	
	public static void sort(int[] a){
		sort(a, 0, a.length - 1);
		System.out.print(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,6,4,2,9,7,5,9,4,7,6,2,8,7,5,6};
		sort(arr);
	}

}
