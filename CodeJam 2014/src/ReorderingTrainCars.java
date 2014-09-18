import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReorderingTrainCars {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
			String x;
			int _cases = 0;
			int _line = 0;
			int _case = 1;
			String[] _values;
			int _totalCases = 0;
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("input/B-small-attempt0.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()){
				_line++;
				if(_line == 1)	_cases = Integer.parseInt(x);
				else if(_line == 2*_case)
					_totalCases = Integer.parseInt(x);
				else if(_line == 2*_case+1){
					_values = x.split(" ");
					int i = 0;
					char[][] characters = new char[_totalCases][2];
					for(String c : _values){
						characters[i][0] = c.charAt(0);
						characters[i++][1] = c.charAt(c.length()-1);
						
					}
				}
				if(_case > _cases)	break;
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
