
public class q6 {
	public static <T> int count(T[]array , T item ) {
		int count = 0 ; 
		for (int i =0 ; i < array.length ; i++) {
			 if (array[i].equals(item)) { // .equal is used to determine whether the it is equal or not 
				count ++ ;
			 }
		}
	return count  ; 
	}
public static void main(String[] args) {
	// Integer array
	
	Integer [] intarr = {12,13,14,14,12,12} ;
	int countInt = count(intarr ,12); 
	System.out.println("count of 2 in intArray : " + countInt); 
	
	// String array 
	String [] strarr = {"hii" , "hello" ,  "hello"} ; 
	int countstr = count(strarr, "hello");
	System.out.println("count hello in the string :" + count(strarr, "hello"));
	// Double array 
	Double [] douarr = {34.34 ,23.56 ,234.223 , 23.56 , 23.56 } ; 
	int countdouble  = count(douarr,23.56) ; 
	System.out.println("count the 23.56 value :" + countdouble);
}
}
