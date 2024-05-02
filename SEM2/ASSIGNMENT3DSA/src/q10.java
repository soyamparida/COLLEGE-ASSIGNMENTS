import java.util.Scanner; 
public class q10 {
	public static int fibonacci(int n ) { 
		// base cases : The first two fibonacci numbers are both 1 
		// calculating the fibonacci
		if (n<=0) {
			throw new IllegalArgumentException("n must be a postive number");
		} else if (n ==1 || n ==2) { 
			return 1 ;
		}
		//Recursive case : - Fibonacci(n) = fibonacci(n-1) + fibonacci(n-2);
		return fibonacci(n-1) + fibonacci(n-2) ;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in) ;
	System.out.println("Enter n: ");
	int n = sc.nextInt();
	System.out.println(fibonacci(n));
	// if you enter n as 7 then it will come 13 how 
	/*
	Base Cases:
		fibonacci
		(
		1
		)
		=
		1
		fibonacci(1)=1
		fibonacci
		(
		2
		)
		=
		1
		fibonacci(2)=1
		Recursive Cases:
		fibonacci
		(
		3
		)
		=
		fibonacci
		(
		2
		)
		+
		fibonacci
		(
		1
		)
		=
		1
		+
		1
		=
		2
		fibonacci(3)=fibonacci(2)+fibonacci(1)=1+1=2
		fibonacci
		(
		4
		)
		=
		fibonacci
		(
		3
		)
		+
		fibonacci
		(
		2
		)
		=
		2
		+
		1
		=
		3
		fibonacci(4)=fibonacci(3)+fibonacci(2)=2+1=3
		fibonacci
		(
		5
		)
		=
		fibonacci
		(
		4
		)
		+
		fibonacci
		(
		3
		)
		=
		3
		+
		2
		=
		5
		fibonacci(5)=fibonacci(4)+fibonacci(3)=3+2=5
		fibonacci
		(
		6
		)
		=
		fibonacci
		(
		5
		)
		+
		fibonacci
		(
		4
		)
		=
		5
		+
		3
		=
		8
		fibonacci(6)=fibonacci(5)+fibonacci(4)=5+3=8
		fibonacci
		(
		7
		)
		=
		fibonacci
		(
		6
		)
		+
		fibonacci
		(
		5
		)
		=
		8
		+
		5
		=
		13
		fibonacci(7)=fibonacci(6)+fibonacci(5)=8+5=13
		*/
}
}