package assginment4;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int computerguess = (int)( 9 * Math.random() +1 );
System.out.println("Computer guess :" + computerguess);
System.out.println("user guess :") ;
int userguess = sc.nextInt();
for (computerguess = 1 ; computerguess<=10 ; ) {
	if (computerguess==userguess) {
		System.out.println( "Too high , try again ");
		break ;
	}
	if (userguess<computerguess) {
		System.out.println("Too low , try again ");
		break ;
	}
	/*
System.out.println("too high , try again ");
*/
	}
	


	}
}


