public class Stacks{
	
	public int first = 0;
	public int last = 0;
	int[] arr;
	
	public Stacks(int n){
		arr = new int[n];
	}
	
	public void push(int a){
		arr[last++] = a;
	}
	
	public int pop() {
		int pop = arr[--last];
		//System.out.print(arr[last]);
		arr[last] = 0;
		return pop;
	}
	
	public static void main(String[] args) {
		Stacks test = new Stacks(100);
		test.push(5);
		test.push(10);
		test.push(7);
		test.pop();
	}
	
}