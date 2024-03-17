import java.util.Scanner ; 
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in) ; 
System.out.println("Enter  a 4 by 4 matrix row  by column ");


int row = sc.nextInt() ; 
int column = sc.nextInt() ; 
double arr [] [] = new double[row][column] ;
for (int i = 0; i<row ; i++) { 
	for (int j = 0 ; j < column ; j++) { 
		arr[i][j] = sc.nextInt();
		System.out.print(arr[i][j]+" ");
	}
	System.out.println("");
}

	}

}
