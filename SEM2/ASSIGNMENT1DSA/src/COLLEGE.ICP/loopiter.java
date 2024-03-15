package conceptCODES;
import java.util.Scanner;

public class loopiter {

	public static void main(String[] args) {
		/*
		int num , count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any positive number ");
	num = sc.nextInt();
	for(int i =1 ; i<=num ; i++ ) {
		if (num / i == 0)
			count ++;
	}
if (count==2)
	System.out.println("Prime");
else 
	System.out.println("Not prime ");
	*/
		
		int  i ;
		for(i=0; i<10 ; i++) {
			if( i % 2 == 0 && i % 3 == 0) {
			break;
		}
		System.out.println(i);
	}
	}
}
