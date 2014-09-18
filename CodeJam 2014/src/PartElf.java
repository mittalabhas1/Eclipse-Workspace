import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PartElf {
	public static void main(String[] args) throws IOException {
		try {
			String x;
			int _cases = 0;
			int _line = 0;
			int _case = 1;
			String[] _value;
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("input/A-large.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()){
				_line++;
				if(_line == 1)	_cases = Integer.parseInt(x);
				else if(_line == _case+1){
					_value = x.split("/");
					long _num = Long.parseLong(_value[0]);
					long _den = Long.parseLong(_value[1]);
					int _finalValue = _checkElf(_num, _den);
					System.out.print("Case #"+_case+": ");
					if(_finalValue == 0)
						System.out.println("impossible");
					else
						System.out.println(_finalValue);
					_case++;
				}
				if(_case > _cases)	break;
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static int _checkElf(long _num, long _den) {
		int _ans = 0;
		int _decrease = 0;
		//if(_num > _den/2 && _num < _den)	_decrease = 1;
		while(_den%2 == 0){
			//if(_num > _den/2 && _num < _den)	_ans--;
			_den /= 2;
			_ans++;
			if(_num >= _den)	break;
		}
		if(_den != 1)
			if(_den%2 == 1)
				if(_den != _num)
					return 0;
		if(_ans > 1 && _decrease == 1)
			_ans--;
		return _ans;
	}
}
