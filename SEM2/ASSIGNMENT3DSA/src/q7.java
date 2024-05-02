import java.util.Scanner ; 
public class q7 {
	public static int factorial(int n) { 
		if(n<0) throw new IllegalArgumentException("Factorial is not defined for the negative numbers.");
		else if(n <=  1) // base case 
			return 1 ;
		else 
			return n *factorial(n-1) ;// inductive step 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner (System.in) ; 
System.out.println("Enter number: ");
int n = sc.nextInt();
System.out.println("Factorial of "  + n + "is : " + factorial(n));
	}

}
