import java.util.Arrays;


@SuppressWarnings("unused")
public class Ques3 {
	
	private static void magic(String test) {
		char[] c = test.toCharArray();
		/*Arrays.sort(c);
		System.out.print(c);*/
	}

	public static void main(String[] args) {
		String test = ">>><<<";
		magic(test);
	}
}
