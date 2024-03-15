import java.util.Scanner ; 
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner ( System.in); 
 System.out.println("The numbered entered is :");
 int n =sc.nextInt() ; 
 int sum = 0 , product = 1 ; 
 while (n!=0) { 
	sum += n%10 ;
	 product *= n%10 ;
	 n=n/10 ;
 }
 System.out.println("printlng the sum " + sum ) ; 
 System.out.println( "printing the product" + product ); 

}
} 