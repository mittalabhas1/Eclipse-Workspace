import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class ProperShuffle {
	
	public static void _Correct(int _integers) {
		int[] _array = new int[_integers];
		
		for(int _i = 0; _i < _integers; _i++)
			_array[_i] = _i;
		for(int _i = 0; _i < _integers; _i++){
			int _j = new Random().nextInt(_integers - 1);
			_swap(_array, _i, _j);
		}
		System.out.println(Arrays.toString(_array));
	}
	
	public static void _swap(int[] a, int b, int c) {
		int swap = a[b];
		a[b] = a[c];
		a[c] = swap;
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws NumberFormatException, IOException {
		int _line = 0;
		int _cases = 0;
		int _case = 1;
		int _integers = 0;
		String _values[] = null;
		String x;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("input/C-small-attempt0.in"));
			for (x = in.readLine(); x != null ; x = in.readLine()) {
				_line++;
				 if(_line == 1){
					 _cases = Integer.parseInt(x);
					 //System.out.println(_cases);
				 }
				 else if(_line == _case+1){
					 _integers = Integer.parseInt(x);
					 _Correct(_integers);
					 //System.out.print(_integers);
				 } else if (_line == _case+2){
					 //_values = x.split(" "); 
					 _case++;
				 }
				 
				 if(_case == _cases+1)	break;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
