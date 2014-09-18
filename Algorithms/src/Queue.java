public class Queue{
	
	public int first = 0;
	public int last = 0;
	int[] arr;
	
	public Queue(int n){
		arr = new int[n];
	}
	
	public void enqueue(int a){
		arr[last++] = a;
	}
	
	
	
	public int dequeue() {
		//System.out.print(arr[first++]);
		//return arr[first];
		return arr[first++];
	}
	
	public static void main(String[] args) {
		Queue test = new Queue(100);
		test.enqueue(5);
		test.enqueue(10);
		test.enqueue(7);
		test.dequeue();
	}
	
}