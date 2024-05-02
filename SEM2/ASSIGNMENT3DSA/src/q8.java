import java.util.Scanner ; 

public class q8 {
	public static int power(int x , int n) { 
		if (n==0)
			return 1; 
		else 
			return x * power(x,n-1) ;
	}
public static void main(String[] args) {
Scanner sc  = new Scanner (System.in); 
	System.out.println("Enter the real value of x and a positive integer n:");
	int x  = sc.nextInt();
	int n = sc.nextInt();
	System.out.println(x + "^" + n + "= " + power(x,n));
}
}
