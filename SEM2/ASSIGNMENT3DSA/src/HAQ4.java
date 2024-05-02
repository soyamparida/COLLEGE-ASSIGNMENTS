import java.util.Scanner; 
public class HAQ4 {
	public static int product(int n , int m ){ 
		int product = n * m ;
		try {
		if (n==0 || m == 0) { 
			return 0;
		}
		if (n<0 || m<0) { 
			throw new IllegalArgumentException("The values must be positive") ;
		}
		}catch (IllegalArgumentException e) { 
			System.out.println(e);
		}
		return product  ;
	}
public static void main(String[] args) {
	Scanner sc  = new Scanner (System.in) ;
	System.out.println("Enter the first number:");
	int n = sc.nextInt();
	System.out.println("Enter the second number:");
	int m = sc.nextInt();
	System.out.println(product(n, m));
}
}
