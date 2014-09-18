import java.io.*;
public class RunningTime {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int _line = 0;
        int _case = 1;
        int N = 0;
        String[] x = null;
        for(String line = br.readLine(); line != null; line = br.readLine()){
            _line++;
            if(_line == 2*_case-1)
                N = Integer.parseInt(line);
            else if(_line == 2*_case){
                x = line.split(" ");
                int[] y = new int[N];
                for(int i = 0; i < N; i++)
                    y[i] = Integer.parseInt(x[i]);
                _countShifts(y);
            }
        }
    }
    
    public static void _countShifts(int[] arr){
        int _counter = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    _swap(arr, j, j-1);
                    _counter++;
                }
                else
                    break;
            }
        }
        System.out.println(_counter);
        
    }
    
    public static void _swap(int[] arr, int i, int j){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}