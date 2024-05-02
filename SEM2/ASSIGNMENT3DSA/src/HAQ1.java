 
public class HAQ1 {
	  public static int gcd(int  m, int n) {
	        if (n == 0) 
	        	return m;
	        return gcd(n, m % n);
	    }
public static void main(String[] args) {
	int m = 14, n = 16;
    int val = gcd(m, n);
    System.out.println("gcd(" + m + ", " + n + ") = " + val);
}
}

