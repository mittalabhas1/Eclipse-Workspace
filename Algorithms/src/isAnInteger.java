
public class isAnInteger{
	
	public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.print(isInteger("123"));
	}
	
}
