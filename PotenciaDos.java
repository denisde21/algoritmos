import java.util.Scanner;


public class PotenciaDos {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
	    String nro=in.next();
	    int result = Integer.parseInt(nro);
            solve(result);
        }

	 static private void solve(int n) {
	    while(true) {
	        if((n%2)!= 0){
	            System.out.println("false");
	            break;
	        }
	        n = n/2;
	        if(n == 1) {
	            System.out.println("true");
	            break;
	        }
	    }
	}
	       
	

}
