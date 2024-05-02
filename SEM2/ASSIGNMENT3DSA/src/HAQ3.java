
public class HAQ3 {
 // Recursive method to convert a positive decimal integer to binary
	public static String decimalToBinary(int n ) { 
		if (n<0) {
			throw new IllegalArgumentException("Input must be a positive integer number");
		}
		if (n == 0) {
			return "" ; // Base case for recursion
		}
		 // Recursive case: Get the binary representation of n / 2 and concatenate the remainder of n % 2
		return decimalToBinary(n/2) + (n%2) ;
	}
public static void main(String[] args) {
	int decimalNumber = 42; 
	String binarrepresentation = decimalToBinary(decimalNumber);
	System.out.println("Binary equivalent of the" + decimalNumber + "iS : " + binarrepresentation);
	/*
	 * Here's how it works for 42:

Step 1: 42 ÷ 2 = 21, remainder 0
The remainder is 0, which is the rightmost binary digit (least significant bit).
Step 2: 21 ÷ 2 = 10, remainder 1
The remainder is 1, which is the next binary digit.
Step 3: 10 ÷ 2 = 5, remainder 0
The remainder is 0, representing the next binary digit.
Step 4: 5 ÷ 2 = 2, remainder 1
The remainder is 1, the next binary digit.
Step 5: 2 ÷ 2 = 1, remainder 0
The remainder is 0, representing the next binary digit.
Step 6: 1 ÷ 2 = 0, remainder 1
The remainder is 1, representing the leftmost binary digit (most significant bit).
	 */
}
}
