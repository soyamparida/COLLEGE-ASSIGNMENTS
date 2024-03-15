package conceptCODES;
import java.util.Scanner;
public class labas3q1 {

	public static void main(String[] args) {
		// q1
		int age ;
		Scanner sc = new Scanner(System.in);
		System.out.println("input the  of a person ");
		age = sc.nextInt();
		if (age >= 10) {
			System.out.println("you are elligible to cast your vote");
		}
		else {
			System.out.println("you are not eligiblibe ");
		}
	}
	

}
