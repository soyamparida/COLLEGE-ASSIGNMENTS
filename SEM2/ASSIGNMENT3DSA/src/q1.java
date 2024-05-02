import java.util.Scanner  ; 

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc = new Scanner (System.in); 
		int lucky  = sc.nextInt(); 
		try { 
			if (lucky<0)
				throw new NumberFormatException 
				("Exception lucky me ") ; 
			else 
				System.out.println("your lucky number is " + lucky);
		} catch (NumberFormatException nfe) {
			System.out.println("WRONG INPUT ");
		}
	}

}
