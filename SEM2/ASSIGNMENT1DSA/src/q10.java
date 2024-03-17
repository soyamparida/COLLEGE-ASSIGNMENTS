import java.util.Scanner ; 

public class q10 {
public static void main(String[] args) {
Scanner  sc = new Scanner (System.in ) ; 
System.out.println("EDnter the number os Elements of Array") ;
int n = sc.nextInt(); 
int array [] = new int [n] ; 
System.out.println("Enter the elements of the array") ;
for (int i = 0 ;  i <= array.length ; i++){
	array[i] = sc.nextInt();
}
// seeing the occurcnce 
int max = array[0] ;
int min = array [0] ; 
int maxcount =  0 ; 
int mincount = 0 ; 
int maxposition ; 
int minposition ;
for (int i = 0 ; i < n ; i ++) {
	if(array[i]> max) {
		max = array[i] ;
		maxcount++ ; 
		maxposition = i ; 
	
} ; 
for (int i1 = 0 ; i1< n ; i1++) { 
	if    (array[i1]< min) {
		min = array[i1] ; 
		mincount ++ ; 
		minposition = i1 ; 
	}
}
System.out.println("maximum element of the Array is" + max + "and " +"occutrens is"+ maxcount) ; 
}

}
}
