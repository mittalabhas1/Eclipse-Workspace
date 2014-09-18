
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TheRepeater {
	
	public static void _analyseThem(String _ans1, String _ans2){
		int _length1 = _ans1.length();
		int _length2 = _ans2.length();
		//System.out.println(_length1);
		//System.out.println(_length2);
		if(_length1 < _length2)
			checkRepeat(_ans1, _ans2);
		else
			checkRepeat(_ans2, _ans1);
	}
	
	private static void checkRepeat(String _ans1, String _ans2) {
		int _length1 = _ans1.length();
		for(int i = 0; i < _length1; i++){
			System.out.println(_ans2.indexOf(_ans1.charAt(i)));
		}
		
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
		String _ans1 = null;
		String _ans2 = null;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("input/A-small-attempt0.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()) {
				_line++;
				 if(_line == 1){
					 _cases = Integer.parseInt(x);
					 //System.out.println(_cases);
				 }
				 else if(_line == _case){
					 _value = Integer.parseInt(x);
					 //System.out.print(_value);
				 } else if(_line == 3*_case){
					 _ans1 = x;
				 } else if(_line == 3*_case+1){
					 _ans2 = x;
					 _analyseThem(_ans1, _ans2);
					 _case++;
				 }
				 
				 if(_case == _cases+1)	break;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
