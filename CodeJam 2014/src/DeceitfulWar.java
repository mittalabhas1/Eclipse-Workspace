import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class DeceitfulWar {
	
	@SuppressWarnings("unused")
	private static int _checkWar(int _stones, String[] _naomi, String[] _ken) {
		int _score = 0;
		int _naomiI = 0;
		int _naomiF = _stones-1;
		int _kenI = 0;
		int _kenF = _stones-1;
		int _counter = 0;
		
		while(_counter < _stones){
			if(Float.parseFloat(_naomi[_naomiF]) > Float.parseFloat(_ken[_kenF])){
				_naomiF--;
				_kenI++;
				_score++;
			}else if(Float.parseFloat(_naomi[_naomiF]) < Float.parseFloat(_ken[_kenF])){
				_kenF--;
				_naomiF--;
			}
			_counter++;
		}
		
		return _score;
	}

	private static int _checkDeceitfulWar(int _stones, String[] _naomi, String[] _ken) {
		int _score = 0;
		int _naomiI = 0;
		int _naomiF = _stones-1;
		int _kenI = 0;
		int _kenF = _stones-1;
		int _counter = 0;
		
		while(_counter < _stones){
			if(Float.parseFloat(_naomi[_naomiI]) > Float.parseFloat(_ken[_kenI])){
				_naomiI++;
				_kenI++;
				_score++;
			}else if(Float.parseFloat(_naomi[_naomiI]) < Float.parseFloat(_ken[_kenI])){
				_naomiI++;
				_kenF--;
			}else if(Float.parseFloat(_naomi[_naomiF]) < Float.parseFloat(_ken[_kenI])){
				return _score;
			}else if(Float.parseFloat(_naomi[_naomiI]) > Float.parseFloat(_ken[_kenF])){
				return _score+_stones-_counter;
			}
			
			_counter++;
		}
		
		return _score;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		String x;
		int _line = 0;
		int _cases = 0;
		int _case = 0;
		int _stones= 0;
		String[] _naomi = null;
		String[] _ken = null;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("input/D-large.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()){
				_line++;
				
				if(_line == 1)
					_cases = Integer.parseInt(x);
				else if(_line == (3*_case)+2)
					_stones = Integer.parseInt(x);
				else if(_line == (3*_case)+3){
					_naomi = x.split(" ");
					Arrays.sort(_naomi);
				}
				else if(_line == (3*_case)+4){
					_ken = x.split(" ");
					Arrays.sort(_ken);
					_case++;
					int _deceitful = _checkDeceitfulWar(_stones, _naomi, _ken);
					int _war = _checkWar(_stones, _naomi, _ken);
					//System.out.println(Arrays.toString(_naomi));
					//System.out.println(Arrays.toString(_ken));
					System.out.println("Case #"+_case+": "+_deceitful+" "+_war);
				}
				
				if(_case == _cases)	break;
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
