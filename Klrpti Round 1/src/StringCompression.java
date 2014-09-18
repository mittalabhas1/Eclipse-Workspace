public class StringCompression {

	public static void compressString(String a){
		char[] c = a.toCharArray();
		int i = 0;
		int n = 1;
		String newString = "";
		int size = c.length;
		while(i < size){
			n = 1;
			newString += c[i];
			while(c[i] == c[++i]){
				n++;
				if(i == size-1)
					break;
			}
			newString += n;
			if(i == size-1)
				break;
		}
		if(n==1){
			newString += c[i];
			newString += n;
		}
		if(size <= newString.length())
			System.out.print(c);
		else
			System.out.print(newString);
	}
	
	public static void main(String[] args) {
		compressString(args[0]);
	}
}
