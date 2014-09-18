import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CookieClicker {
	
	private static void _checkwin(double _farm, double _rate, double _win, int _case) {
		
		double _rateInit = 2;
		double _time = 0;
		double _temp1 = _farm/_rateInit;
		double _temp2 = _win/_rateInit;
		_rateInit += _rate;
		double _temp3 = _win/_rateInit;
		
		while(_temp1 + _temp3 < _temp2){
			_time += _temp1;
			_temp1 = _farm/_rateInit;
			_temp2 = _win/_rateInit;
			_rateInit += _rate;
			_temp3 = _win/_rateInit;
			//System.out.println(_time);
		}
		_time += _temp2;
		System.out.println("Case #"+_case+": "+_time);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double _rate = 0;
		double _farm = 0;
		double _win = 0;
		double _line = 0;
		int _cases = 0;
		int _case = 1;
		String x;
		String[] _values = null;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("input/B-large.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()) {
				_line++;
				 if(_line == 1){
					 _cases = Integer.parseInt(x);
					 //System.out.println(_cases);
				 }
				 else if(_line == _case+1){
					 _values = x.split(" ");
					 _farm = Double.parseDouble(_values[0]);
					 _rate = Double.parseDouble(_values[1]);
					 _win = Double.parseDouble(_values[2]);
					 //System.out.println(_farm);
					 //System.out.println(_rate);
					 //System.out.println(_win);
					 _checkwin(_farm, _rate, _win, _case);
					 _case++;
				 }
				 
				 if(_case == _cases+1)	break;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
