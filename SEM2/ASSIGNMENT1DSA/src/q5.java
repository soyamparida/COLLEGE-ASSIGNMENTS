import java.util.Scanner ;
class abc{
	public int sum = 0 ;
	public  int sumofdigits(int n) { 
		while (n>0) {
			int d = n%10 ; 
			sum += d ; 
			n=n/10 ;
		}
		return sum ; 
	}
}
public class q5 {
	
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in) ;
System.out.println("Enter a number ") ; 
int n = sc.nextInt();
abc soyam = new abc();
int sum = soyam.sumofdigits(n);
System.out.println(sum);
 	}

}

