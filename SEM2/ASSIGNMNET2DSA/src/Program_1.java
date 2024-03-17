import java.util.Scanner ; 

	 class person  {
	String name  ;
	int age  ; 
	public void setData (String n , int a)  {
		this.name = n; 
		this.age= a; 
	}
	void displaydata () { 
		System.out.println("my name is"+ name);
		System.out.println("my age is"+   age);
	}
 }

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in) ;
		
 person p1  = new person () ;
 p1.name = "Rohan" ;
 p1.age = 34 ;
//System.out.println(p1.name) ; 
//System.out.println(p1.age);
person p2 = new person ();
System.out.println("Enter your name");
 String myname = sc.nextLine();
 System.out.println("Enter your age");// we use nextline for string in scanner case !
 int myage = sc.nextInt() ;
 p2.setData(myname, myage);
 p1.displaydata();
 p2.displaydata();
 
 if (p1.age>myage) {
	 System.out.println(myname+"is younger");
 }else {
	 System.out.println(p1.name + " is younger");
 }
	}
	}
