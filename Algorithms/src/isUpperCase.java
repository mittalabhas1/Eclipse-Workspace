
public class isUpperCase {
	public static boolean isUpper(String s){
        for(int x = 0; x < s.length(); x++) {  
              if(!Character.isUpperCase(s.charAt(x)))
                  return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.print(isUpper("ASD"));
	}
}
