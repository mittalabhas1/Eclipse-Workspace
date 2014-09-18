
public class DecimaltoOthers {

	private static int convertToOthers(int decimal, int conversionSystem) {
		String converted = "";
		while(decimal>0){
			int remainder = decimal % conversionSystem;
			decimal /= conversionSystem;
			converted = remainder+converted;
		}
		return Integer.parseInt(converted);
	}
	
	public static void main(String[] args) {
		System.out.print(convertToOthers(2, 2));
	}
}
