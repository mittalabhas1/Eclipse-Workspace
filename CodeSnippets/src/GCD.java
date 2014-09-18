
public class GCD {
	
	public static int GCF(int a, int b){
		if(a<b)
			return GCF(b, a);
		else{
			if(b==0)	return a;
			else return GCF(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(GCF(105, 45));
	}
}
