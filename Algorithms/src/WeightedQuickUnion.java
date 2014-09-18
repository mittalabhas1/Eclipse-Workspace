import java.util.Arrays;


public class WeightedQuickUnion {

	private static int[] id;
	private static int[] size;
	
	public WeightedQuickUnion(int N){
		id = new int[N];
		size = new int[N];
		for(int i = 0; i<N; i++){
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public int root(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public void union(int a, int b){
		int p = root(a);
		int q = root(b);
		if(size[p]<size[q]){
			id[p] = q;
			size[q] += size[p];
		} else{
			id[q] = p;
			size[p] += size[q];
		}
	}
	
	public boolean connected(int a, int b){
			return root(a) == root(b);
	}
	
	public static void main(String[] args) {
		WeightedQuickUnion FU = new WeightedQuickUnion(10);
		FU.union(5, 4);
		FU.union(7, 5);
		FU.union(0, 3);
		FU.union(9, 3);
		FU.union(8, 4);
		FU.union(0, 5);
		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(size));
		System.out.print(FU.connected(5, 2));
	}
}
