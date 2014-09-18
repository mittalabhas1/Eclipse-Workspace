
public class BinarySearchTree<Key extends Comparable<Key>> {
	
	@SuppressWarnings("unused")
	private class Node {
		private Key key;
		private int M;
		private Node left;
		private Node right;
		
		public Node(int M){
			this.M = M;
			this.left = new Node(2*this.M);
			this.right = new Node(2*this.M + 1);
		}
		
		public Node(int M, Key key){
			this.M = M;
			this.key = key;
			this.left = new Node(2*this.M);
			this.right = new Node(2*this.M + 1);
		}

	}

	private Key[] pq;
	private int N;
	private int root = 1;
	
	@SuppressWarnings("unchecked")
	public BinarySearchTree(int capacity){
		pq = (Key[]) new Comparable[capacity+1];
	}
	
	public void put(Key key){
		get(key);
	}

	private void get(Key key) {
		int root = 1;
		
		while(root < N){
			
		}
	}

	public static void main(String[] args) {
		
	}
}
