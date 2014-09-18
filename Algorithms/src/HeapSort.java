import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class HeapSort<Key extends Comparable<Key>> extends BinaryHeap<Key> {
	
	public HeapSort(int capacity) {
		super(capacity);
	}
	
	@Override public void delMax(){
		swap(pq, 1, N--);
		sink(1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		HeapSort<String> heap = new HeapSort<String>(input.length);
		for(String k : input)	heap.insert(k);
		while(!heap.isEmpty())	heap.delMax();
		System.out.print(Arrays.toString(heap.pq));
	}
}
