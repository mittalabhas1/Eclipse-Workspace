import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BinaryHeap<Key extends Comparable<Key>> {
	
	public Key[] pq;
	public int N;
	
	@SuppressWarnings("unchecked")
	public BinaryHeap(int capacity){
		pq = (Key[]) new Comparable[capacity+1];
	}
	
	public Key returnMax(){
		return pq[1];
	}
	
	public void delMax(){
		swap(pq, 1, N--);
		sink(1);	//Takes the smaller entry down to order the heap again
		pq[N+1] = null;	//Prevents loitering
	}
	
	public void insert(Key k){
		pq[++N] = k;
		swim(N);
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public void swim(int k){
		while(k > 1 && less(pq, k/2, k)){
			swap(pq, k, k/2);	//Swaps entry at k and k/2 if the entry at k/2 (parent node) is smaller
			k /= 2;
		}
	}
	
	public void sink(int k){
		while(2*k <= N){
			int j = 2*k;
			if(j < N && less(pq, j, j+1))	j++;
			if(!less(pq, k, j))	break;
			swap(pq, k, j);
			k = j;
		}
	}
	
	public boolean less(Key[] pq, int x, int y){
		return pq[x].compareTo(pq[y]) < 0;
	}
	
	public void swap(Key[] pq, int x, int y){
		Key key = pq[x];
		pq[x] = pq[y];
		pq[y] = key;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		BinaryHeap<String> heap = new BinaryHeap<String>(input.length);
		for(String k : input){
			heap.insert(k);
		}
		System.out.println(Arrays.toString(heap.pq));
	}
}
