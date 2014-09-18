import java.io.*;
public class ValidPanFormat { //checks for AAAAA5555A
    
    public static void checkPan(String pan){
        String first = pan.substring(0, 5);
        String second = pan.substring(5,9);
        String third = pan.substring(9);
        if(isInteger(second) && isUpper(first) && isUpper(third))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static boolean isUpper(String s){
        for(int x = 0; x < s.length(); x++) {  
              if(!Character.isUpperCase(s.charAt(x)))
                  return false;
        }
        return true;
    }
    
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = 0;
        int cases = 0;
        int _case = 1;
        for(String x = br.readLine(); x != null; x = br.readLine()){
            lines++;
            if(lines == 1)
                cases = Integer.parseInt(x);
            else if(lines == _case + 1){
                checkPan(x);
                _case++;
            }
            if(_case>cases)    break;
        }
     }
}