
public class OthersToDecimal {

	private static int convertToDecimal(int others, int conversionSystem) {
		int decimal = 0;
		String others1 = String.valueOf(others);
		for(int i = others1.length()-1; i >=0; i--)
			decimal += Integer.parseInt(others1.substring(i, i+1))*Math.pow(conversionSystem, others1.length()-1-i);
		return decimal;
	}
	
	public static void main(String[] args) {
		System.out.println(convertToDecimal(111, 2));
	}
}
