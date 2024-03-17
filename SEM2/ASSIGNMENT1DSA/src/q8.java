
import java.util.Scanner ; 
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner ( System.in ) ; 
System.out.println("Enter the number of rows  and columns of 2DArray  :"); 
int row = sc.nextInt() ;
int column = sc.nextInt() ; 
int  [] [] arr = new int [row] [column] ; 
System.out.println("Enter the elements of 2DARRAy ") ;
for (int i = 0 ; i <row; i++) {
	for (int j = 0 ; j < column ; j++) {
		arr[i][j] = sc.nextInt() ; 	
}
	
}
int sum = 0 ; 
for (int i = 0 ; i<row ; i++  ){
	for (int j = 0 ; j<column; j++) { 
		System.out.print(arr[i][j]+" ");
		sum += arr[i][j];
}
	System.out.println(""); 
}
System.out.println("The sum of the elemets of the array is " + sum); 
	}

}
