import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Ques1 {
	
	public static int count = 0;
	
	public static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		for(int k = lo; k<= hi; k++)
			aux[k] = a[k];
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k<=hi; k++){
			if(i>mid && j>hi)
				break;
			else if (i > mid)
				a[k] = aux[j++];
			else if (j > hi){
				a[k] = aux[i++];
				count++;
			}
			else if (aux[i] < aux[j])
				a[k] = aux[i++];
			else if (aux[i] > aux[j]){
				a[k] = aux[j++];
				count++;
			}
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
		System.out.println(count);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BufferedReader br = null;
		int count = 0;
		try {
			@SuppressWarnings("unused")
			String sCurrentLine;
			br = new BufferedReader(new FileReader("input/10.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(Integer.valueOf(sCurrentLine));
				count++;
			}
			int[] numbers = new int[count];
			String sCurrentLine1;
			BufferedReader br1 = new BufferedReader(new FileReader("input/10.txt"));
			int count1 = 0;
			while((sCurrentLine1 = br1.readLine()) != null){
				numbers[count1] = Integer.valueOf(sCurrentLine1);
				//System.out.println(Integer.valueOf(sCurrentLine1));
				count1++;
			}
			System.out.println(Arrays.toString(numbers));
			sort(numbers);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//System.out.print(count);
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}