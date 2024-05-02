import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] arr = {"Red" ,  "Yellow" , "Green"  , "Purple" , "Black"} ; 
Scanner sc  = new Scanner (System.in) ; 
try { 
	for (int  i = -1 ; i < 5 ; i++ ) {
		System.out.println("colour" + arr[i]+ "length" + arr[i].length());
	}
	}catch (ArrayIndexOutOfBoundsException obj ) {
		System.out.println(obj.getMessage());
	}
	}
}
