
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NewLotteryGame {
	
	public static String binaryNo(int a) {
		String b = null;
		if(a <= 1)
			b += String.valueOf(a);
		int remainder = a % 2;
		binaryNo(a >>1);
		b += String.valueOf(remainder);
		return b;
	}
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws NumberFormatException, IOException {
		int _line = 0;
		int _cases = 0;
		int _case = 1;
		int _value = 0;
		String _values[] = null;
		String x;
		int _lineNo = 0;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("input/B-small-attempt0.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()) {
				_line++;
				 if(_line == 1){
					 _cases = Integer.parseInt(x);
					 //System.out.println(_cases);
				 } else if(_line == _case+1){
					 //System.out.print(_case);
					 _values = x.split(" ");
					 int _value1 = Integer.parseInt(_values[0]);
					 int _value2 = Integer.parseInt(_values[1]);
					 int _value3 = Integer.parseInt(_values[2]);
					 
					 //System.out.println(Arrays.toString(_values));
					 _case++;
				 }
				 
				 if(_case == _cases+1)	break;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
