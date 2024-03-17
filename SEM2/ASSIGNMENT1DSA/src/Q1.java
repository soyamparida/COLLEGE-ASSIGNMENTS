
public class Q1 {
	public static void main(String[] args) {
	int num = Integer.parseInt(args[0]) ;
	System.out.println("The positive integer greater than 2 from the command line arugument is " + num ); 
	int count = 0 ; 
	while (num >= 2 ) {
		num /= 2 ; 
		count ++ ; 
	}
System.out.println("The number of timea ome must repeatedly divide this number by  2 before getting a value less than 2 is  ") ;	}

}
