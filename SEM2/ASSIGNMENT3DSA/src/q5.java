
public class q5 {
	public static <E> void printArray(E[] inputArray) { 
		for(int i = 0 ; i <inputArray.length ; i++){ 
			System.out.println(inputArray[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer
Integer [] intArray = {1 , 2 , 3 , 4 , 5 } ;
System.out.println("Integer Array");
printArray(intArray);
// String Array 
String [] strArray = {"A" , "B" , "C" , "D"}; 
System.out.println("String Array");
printArray(strArray);
// Double Array
Double [] doubArray = {56.23 , 3232.23 , 12.12}; 
System.out.println("Double Array");
printArray(doubArray);
}
}
