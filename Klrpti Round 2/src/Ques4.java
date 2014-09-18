public class Ques4 {
	
	public static void main(String[] args) {
		String start = "[{(";
		String end = "]})";
		String test = "[{()}]";
		int sizeOfArray = test.length();
		int mid = sizeOfArray/2;
		int i = 0;
		String[] ans = new String[3];
		while(i<mid){
			int position = start.indexOf(test.charAt(i));
			if(test.charAt(sizeOfArray - i - 1) == end.charAt(position))
				ans[i] = "Yes";
			else
				ans[i] = "No";
			i++;
		}
		if(ans[0] == "Yes" && ans[1] == "Yes" && ans[2] == "Yes")
			System.out.println("Yes");
		else
			System.out.print("No");
	}
}
