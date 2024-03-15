package assginment4;

 import java.util.Scanner ;
 
public class q4 {

	public static void main(String[] args) {
		 
		Scanner  sc = new Scanner (System.in);
		
		System.out.println("Enter the first number :");
		int x= sc.nextInt();
		System.out.println("Enter the second number :");
		int y = sc.nextInt();
		int a = x , b = y ;
		
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + x + " and " + y + " is: " + a);

        sc.close();
	}

}
