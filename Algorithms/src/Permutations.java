public class Permutations {

  public static void permute(String beginningString, String endingString) {
    if (endingString.length() <= 1)
      System.out.println(beginningString + endingString);
    else
      for (int i = 0; i < endingString.length(); i++) {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
          permute(beginningString + endingString.charAt(i), newString);
      }
  }
  
  public static void permute(String endingString){
	  permute("", endingString);
  }
  
  public static void main(String args[]) {
    permute("hat");
  }
}