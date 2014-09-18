import java.util.Arrays;

public class MergeSort{
	
	public static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		for(int k = lo; k<= hi; k++)
			aux[k] = a[k];
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k<=hi; k++){
			if(i>mid && j>hi) break;
			if (i>mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (aux[i] < aux[j])
				a[k] = aux[i++];
			else
				a[k] = aux[j++];
		}
	}
	
	public static void sort(int[] a, int[] aux, int lo, int hi) {
		if(hi > lo) {
			int mid = (lo+hi)/2;
			//System.out.print(mid);
			sort(a, aux, lo, mid);
			sort(a, aux, mid+1, hi);
			merge(a, aux, lo, mid, hi);
		}
	}
	
	public static void sort(int[] a) {
		int[] aux = new int[a.length];
		sort(a, aux, 0, a.length-1);
		System.out.print(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,6,4,2,9,7,5,3,4,7,6,2,8,7,5,6};
		sort(arr);
	}
}
