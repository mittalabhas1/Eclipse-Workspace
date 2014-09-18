import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MineSweeper {
	
	private static boolean _checkPrime(int _B){
		if(_B == 2)
			return true;
		else if(_B % 2 == 0)
			return false;
		else{
			for(int _i = 3; _i <= Math.sqrt(_B); _i += 2)
				if(_B % _i == 0)
					return false;
			return true;
		}
	}
	
	private static void _createGrid(int _R, int _C, int _M, int _case) {
		
		System.out.println("Case #"+_case+":");
		
		//Code if one of _C and _R is 1
		if(_R == 1 || _C == 1){
			int _max = Math.max(_R, _C);
			if(_M <= _max){
				int _i = 0;
				String[] grid = new String[_max];
				while(_i < _M)
					grid[_i++] = "*";
				while(_i < _max-1)
					grid[_i++] = ".";
				if(_i == _max - 1)
					grid[_i] = "c";
				int _j = 0;
				while(_j < _max){
					if(_C == 1)
						System.out.println(grid[_j++]);
					else
						System.out.print(grid[_j++]);
				}
					
			}else	System.out.println("Impossible");
		}else{	//If none of them are one
			int _B = (_R * _C) - _M;
			boolean _prime =  _checkPrime(_B);
			//System.out.println(_prime);
			if(_prime == true)
				System.out.println("Impossible");
			else{
				//System.out.println("fuck");
				int _rowsToFill = _M/(Math.min(_R, _C));
				
				if(_rowsToFill == 0)
					_rowsToFill = 1;
				
				int _maxRectangle = _rowsToFill*(Math.min(_R, _C));
				
				if(_maxRectangle > _M)
					_maxRectangle = _M;
				
				System.out.println(_maxRectangle);
			}
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		String x;
		int _line = 0;
		int _cases = 0;
		int _case = 1;
		String[] _values = null;
		int _R = 0;
		int _C = 0;
		int _M = 0;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("input/C-small-attempt0.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()){
				_line++;
				
				if(_line == 1)
					_cases = Integer.parseInt(x);
				else if (_line == _case + 1){
					_values = x.split(" ");
					_R = Integer.parseInt(_values[0]);
					_C = Integer.parseInt(_values[1]);
					_M = Integer.parseInt(_values[2]);
					_createGrid(_R, _C, _M, _case);
					_case++;
				}
				
				if(_case == _cases + 1)	break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
