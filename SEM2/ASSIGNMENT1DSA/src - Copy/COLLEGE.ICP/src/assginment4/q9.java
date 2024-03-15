package assginment4;
import java.util.Scanner ;

public class q9 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int inputNumber = sc.nextInt();

// Variable to store the result after removing zeros
int resultNumber = 0;

// Use a while loop to process each digit of the input number
while (inputNumber > 0) {
    int digit = inputNumber % 10;

    // Skip zeros, add other digits to the result
    if (digit != 0) {
        resultNumber = resultNumber * 10 + digit;
    }

    // Move to the next digit
    inputNumber /= 10;
}

// Reverse the result to get the correct order
int reversedResult = 0;
while (resultNumber > 0) {
    int digit = resultNumber % 10;
    reversedResult = reversedResult * 10 + digit;
    resultNumber /= 10;
}

System.out.println("Output after removing zeros: " + reversedResult);

sc.close();
	
	}

}
