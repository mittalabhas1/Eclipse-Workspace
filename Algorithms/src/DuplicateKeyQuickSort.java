import java.util.Arrays;


public class DuplicateKeyQuickSort {
	
	public static void swap(int[] arr, int a, int b){
		int swap = arr[a];
		arr[a] = arr[b];
		arr[b] = swap;
	}
	
	private static void sort(int[] arr, int lo, int hi) {
		if(hi <= lo)	return;
		int i = lo, lt = lo, gt = hi;
		while(i <= gt){
			if(arr[i] < arr[lo])	swap(arr, arr[i++], arr[lt++]);
			else if(arr[i] > arr[lo])	swap(arr, arr[gt--], arr[i]);
			else	i++;
		}
		sort(arr, lo, lt-1);
		sort(arr, gt+1, hi);
	}

	public static void sort(int[] arr){
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,6,4,2,9,7,5,9,4,7,6,2,8,7,5,6};
		sort(arr);
	}
}
