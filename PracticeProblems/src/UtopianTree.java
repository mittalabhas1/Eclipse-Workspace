import java.io.*;
public class UtopianTree {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int _line = 0;
        int _cases = 0;
        int _case = 1;
        int[] _ans = new int[61];
        _ans[0] = 1;
        int _counter = 0;
        for(String line = br.readLine(); line != null; line = br.readLine()){
            _line++;
            if(_line == 1)    _cases = Integer.parseInt(line);
            else if(_line == _case + 1){
                int _number = Integer.parseInt(line);
                if(_counter >= _number){
                    System.out.println(_ans[_number]);
                }else{
                    for(int i = _counter+1; i < _number+1; i++){
                        if(i%2 == 0){
                        	_ans[i] = _ans[i-1] + 1;
                        	_counter++;
                        }
                        else{
                        	_ans[i] = 2*_ans[i-1];
                        	_counter++;
                        }
                    }
                    System.out.println(_ans[_number]);
                }
                _case++;
            }
            if(_case > _cases)    break;
        }        
    }
}