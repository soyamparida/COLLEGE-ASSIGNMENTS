package assginment4;
import java.util.Scanner ; 

public class q3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int sum = 0, count = 0;

	        System.out.print("Random numbers generated are: ");

	        do {
	            int random = (int) (Math.random() * n + 1); 
	            /*
	            System.out.println(Math.random()); // it will show in double in the range of 0.0 and 1.0 
		        System.out.println(Math.random()*n); // it will show the  number multiplied with the random value but between the range of 0.0 to 1.0 
	           	System.out.println(Math.random()*n+1);   // it will show  the number multiplied to the number but in the  range between the  value suppose n value is 8 so the you have entered the value
	           	(int) because then also it will be  in double  values only so we  have to type cast 
	             */
	            System.out.print(random + " ");
	            sum += random;
	            count++;
	        } while (count <= n);

	        System.out.println();
	        double average = (double) sum / n;
	        System.out.println("Average of the random numbers: " + average);

	        sc.close();
	    }
	
	} 

