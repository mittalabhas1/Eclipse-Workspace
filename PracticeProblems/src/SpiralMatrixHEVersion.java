import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class SpiralMatrixHEVersion {
	
	private static void _makegrid(int _dimension, PrintWriter pwd, DecimalFormat df) {
		int[][] _grid = new int[_dimension][_dimension];
		int _initX = 0;
		int _initY = 0;
		int _endX = _dimension - 1;
		int _endY = _dimension - 1;
		int _number = _dimension*_dimension;
		
		while(_number > 0){
			
			for(int i = _endX; i >= _initX; i-- )
				_grid[_endY][i] = _number--;
			_endY--;
			for(int i = _endY; i >= _initY; i--)
				_grid[i][_initX] = _number--;
			_initX++;
			for(int i = _initX; i <= _endX; i++)
				_grid[_initY][i] = _number--;
			_initY++;
			for(int i = _initY; i <= _endY; i++)
				_grid[i][_endX] = _number--;
			_endX--;
		}
		
		_evaluatePercentage(_dimension, _grid, pwd, df);
	}

	private static void _evaluatePercentage(int _dimension, int[][] _grid, PrintWriter pwd, DecimalFormat df) {
		int i = 0;
		double _primes = 0;
		while(i < _dimension){
			if(_checkPrime(_grid[i][i])){
				_primes++;
			}
			if(_checkPrime(_grid[_dimension-i-1][i])){
				_primes++;
			}
			i++;
		}
		double percent = (_primes*100)/(2*_dimension - 1);
		pwd.println(df.format(percent));
		pwd.flush();
		pwd.close();
	}
	
	private static boolean _checkPrime(int _B){
		if(_B == 2)
			return true;
		else if(_B % 2 == 0 || _B == 1)
			return false;
		else{
			for(int _i = 3; _i <= Math.sqrt(_B); _i += 2)
				if(_B % _i == 0)
					return false;
			return true;
		}
	}
	
	private static void _readfile() throws NumberFormatException, IOException, FileNotFoundException {
		int _line = 0;
		String x;
		int _cases = 0;
		int _case = 1;
		int _dimension = 0;
		
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pwd = new PrintWriter(new OutputStreamWriter(System.out));
			DecimalFormat df =new DecimalFormat("#.000000");
			for(x = in.readLine(); x!= null; x = in.readLine()){
				_line++;
				if(_line == 1)
					_cases = Integer.parseInt(x);
				else if(_line == _case+1){
					_dimension = Integer.parseInt(x);
					_makegrid(_dimension, pwd, df);
					_case++;
				}
				
				if(_case > _cases)	break;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, FileNotFoundException, IOException {
		_readfile();
	}
	
}
