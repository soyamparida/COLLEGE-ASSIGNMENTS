import java.util.Scanner;
class student { 
	String name ; 
	int marks ; 
	 /*
	  * student (String name , int marks ) { 
	  * this.name = name ; 
	  * this.marks = marks ; 
	  * 	  
}
*/
	void display () { 
		System.out.println("The name of the student is " + name);
		System.out.println("The marks of the student is " + marks);
	}
}
class MarksOutOfBoundException  extends Exception { 
	public MarksOutOfBoundException(int marks) {
		// TODO Auto-generated constructor stub 
		super ("Invalid marks exception " + marks) ; 
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner (System.in) ; 
System.out.println();
int marks = sc.nextInt() ; 
try { 
	if (marks > 100)  
		throw new MarksOutOfBoundException
		(marks);
	}catch (MarksOutOfBoundException m) { 
		System.out.println(m.getMessage()); 
	}
	}
}
	

