import java.util.Arrays;

public class Permutation {
	
	public static String sortString(String a){
		char[] c = a.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void checkSame(String a, String b){
		if(sortString(a).equals(sortString(b)))
			System.out.print(a+" & "+b+" are permutations of each other!");
		else
			System.out.print(a+" & "+b+" aren't the permutations of each other!");
	}
	
	public static void main(String[] args) {
		checkSame(args[0], args[1]);
	}
}