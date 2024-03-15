package conceptCODES;
import java.util.Scanner;

public class ass3pt1 {

	public static void main(String[] args) {
		// q4
		
	//Scanner sc = new Scanner (System.in);
	/*
	System.out.println("Enter user number :");
	int enternumber = sc.nextInt();
	System.out.println("computer guesses");
	int computerguess   =  sc.nextInt();
	
	if (enternumber == computerguess) {
		System.out.println(" you got it correct");
	}
	else if (enternumber == computerguess + 1 || enternumber == computerguess - 1){
		System.out.println("Almost got it correct");
	}
	 else {
		 System.out.println("You go it wrong.");
	 }
	 */
		// q5 
	/*
	System.out.println("input the year:");
		int year = sc.nextInt();
	if (year % 4 == 0) {// % = 0 means even 
		System.out.println("true");
	}
	else {
		System.out.println("false");
		
	
	}
	*/
	// q 6
	/*
	System.out.println("Enter the number of units consumed ");
	int units  = sc.nextInt();
 int monthlybill;
 float  monthlybill1 ;
	if (units <= 50) {
		monthlybill = units * 3;
		System.out.println(monthlybill);
	}
	else if (units > 50 || units <= 200  ) {
	monthlybill1 = (float) (units * 4.80) ;// we cant multiply int to float so we need to type cast 
		System.out.println(monthlybill1);
	}
	else if (units >200 || units <= 400) {
		monthlybill1 = (float)(units * 5.80);
		System.out.println(monthlybill1);
	}
	else if (units > 400) {
		monthlybill1  =(float) (units * 6.20);
		System.out.println(monthlybill1);
	}
	*/
	
	// q7 
	/*
	System.out.println("Enter the number of units consumed " );
	int units  = sc.nextInt();
	System.out.println("Do you want to pay online (y/n) :" + "y");
 float  monthlybill1 ;
	
	 if (units > 50 || units <= 200  ) {
	monthlybill1 = (float) (units * 4.80) ;// we cant multiply int to float so we need to type cast
	System.out.println("Total amount :" + monthlybill1);
	float discount = monthlybill1 * 3/100 ;
	System.out.println("discount :" + discount);
	float amount = monthlybill1 - discount;
	System.out.println("Amount payable :" + amount );
	}
	// float discount =  (float)(monthlybill1  * 3/100) ;
	*/ 
// question 8
/*
     System.out.print("Enter the x-coordinate: ");
     double x = sc.nextDouble();

     System.out.print("Enter the y-coordinate: ");
     double y = sc.nextDouble();

     if (x == 0 && y == 0) {
         System.out.println("(" + x + ", " + y + ") is at the origin.");
     } else if (x == 0) {
         System.out.println("(" + x + ", " + y + ") is on the y-axis.");
     } else if (y == 0) {
         System.out.println("(" + x + ", " + y + ") is on the x-axis.");
     } else {
         if (x > 0) {
             if (y > 0) {
                 System.out.println("(" + x + ", " + y + ") is in quadrant I.");
             } else {
                 System.out.println("(" + x + ", " + y + ") is in quadrant IV.");
             }
         } else {
             if (y > 0) {
                 System.out.println("(" + x + ", " + y + ") is in quadrant II.");
             } else {
                 System.out.println("(" + x + ", " + y + ") is in quadrant III.");
             }
         }
     }
*/
     // question 7 
   //  Scanner sc = new Scanner (System.in);
	// self done half wrong 
	/*
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("Enter the values of the a , b , c "+ a +" "+ b + " " + c );
    if (a>b && a>c ) {
    	System.out.println("largest number is :" +a);
    }
    else if (b>a &&  b > c) {
    	System.out.println("largest number is :"  +b);
    }
    else if (c>a &&  c>b) {
    	System.out.println("largest number is :" +c); 	
    
    }
    while (b> a &&  b>c && a<b && a>c && c<a && c<b) {
    	System.out.println("second largest number is :" + a);
    	break;
    }
    while (a>b && a>c && b<a && b>c && c<a && c<b ) {
    	System.out.println("second largest number is :" + b);
    	break;
    }
    while (c>a && c>b && b<c && b>a && a<b && a<c) {
    	System.out.println("second largest number is:" + c);
    	break;
    }
    /*
	if (b> a &&  b>c && a<b && a>c && c<a && c<b) {
		System.out.println("second largest number is :" + a);
	}
	if (a>b && a>c && b<a && b>c && c<a && c<b ) {
 System.out.println("second largest number is :" + b);		
	}
	if(c>a && c>b && b<c && b>a && a<b && a<c) {
		System.out.println("second largest number is:" + c);
	}
*/

// same solution 
	
	/*
	 System.out.print("Enter the first number (a): ");
     int a = sc.nextInt();

     System.out.print("Enter the second number (b): ");
     int b = sc.nextInt();

     System.out.print("Enter the third number (c): ");
     int c = sc.nextInt();

     // Finding the largest number
     int largest = Math.max(a, Math.max(b, c));// The Math.max function is used to find the maximum of the three numbers (a, b, and c), and the result is stored in the variable largest.

     // Finding the second largest number
     int secondLargest = (a == largest) ? Math.max(b, c) : (b == largest) ? Math.max(a, c) : Math.max(a, b);// This line uses the ternary conditional operator (? :) to determine which of the other two numbers is the second largest, based on the value of the largest number , where you  cannot insert third variable to check it will automatically check .

     System.out.println("The largest number is: " + largest);
     System.out.println("The second largest number is: " + secondLargest);
*/
	
	// switch case  ex for q10
	/*
	int days = sc.nextInt();
	switch (days) {
	case 1:
		System.out.println("monday");
		break;
	case 2 : 
		System.out.println("tuesday");
		break;
	case 3 :
		System.out.println("wednesday");
		break;
	case 4 :
		System.out.println("thursday");
		break;
	case 5: 
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
		default :
			System.out.println("invalid");
	}
*/
	
// q10 
	
	//int marks = sc.nextInt();
	
	/*
	switch (marks) { // we write like this so 
	case >=90 {
		*/
	 /*
	switch(marks/10) {
	case 10:
	case 9 :
		System.out.println("Grade is:" + " " + "o");
		break;
	case 8 :
		System.out.println("Grade is:" +" " + "A");
		break;
     case 7: 
		System.out.println("Grade is:" +" " +"B");
		break;
	case 6:
		System.out.println("Grade is:" +" " +"C");
		break;
	case 5:
		System.out.println("Grade is:" +" " +"D");
		break;
	case 4:
		System.out.println("Grade is:" +" " +"E");
		break;
	default :
		System.out.println("Grade is:" +" "+"F");
	}
*/
	/*
	Scanner j=new Scanner(System.in);
	double a,b;
	System.out.print("enter your monthly electricity in unit");
	a=j.nextDouble();
	if(a<=50)
	{b=a*3;
	System.out.print("amount is"+b);}
	else if (a<=200)
	{	b=(50*3)+(4.80*(50-a));
	System.out.print("amount is"+b);}
	else if (a<=400)
	{	b=(50*3)+(4.80*(200-50))+(5.80*(200-a));
	System.out.print("amount is"+b);}
	else if (a>400)
		{b=(50*3)+(4.80*(200-50))+(5.80*(400+200))+(6.20*(400-a));
		
	System.out.print("amount is"+b);}
	*/
	
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter your monthly electricity in unit");
	a=sc.nextDouble();
	System.out.println("Do you want to pay online(y/n):" + "y");
	if(a<=50) {
	b=a*3;
	System.out.print("amount is"+b);}
	else if (a<=200) {
		b=(50*3)+(4.80*(a-50));
	System.out.print("amount is"+b);}
	else if (a<=400) {
		b=(50*3)+(4.80*(200-50))+(5.80*(a-200));
	System.out.print("amount is"+b);}
	else if (a>400) {
		b=(50*3)+(4.80*(200-50))+(5.80*(400-200))+(6.20*(a-400));
		
	System.out.println("amount is"+b);
	double discount = b*3/100;
	System.out.println( "discount:" + discount);
	double lastamount  = b - discount ;
	System.out.println("Amount payable:" + lastamount);
	}
	}
}

