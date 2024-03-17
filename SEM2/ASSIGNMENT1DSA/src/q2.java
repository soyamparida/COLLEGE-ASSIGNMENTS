import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("The persons weight is ") ; 
	double  weight = sc .nextDouble() ;
	System.out.println ("The persons height is ") ;
     double  height = sc.nextDouble(); 
	  System.out.println("The persons BMI is");
	double bmi = ( weight ) / ( height * height )  ; 
		if ( bmi <= 18.5) { 
			System.out.println ("underweight!") ; 
		} else if (bmi == 18.5 && bmi <= 24.9) { 
			System.out.println("normal weight "); 
		} else if (bmi == 25.0 && bmi <= 29.9 ) 
			System.out.println(" Overweight!") ; 
	   else
				System.out.println("obese"); 
	} 
}

