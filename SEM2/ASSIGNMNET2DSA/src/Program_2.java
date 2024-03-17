class complex { 
	int real ;
	int image; 
public void setdata (int a , int b ) {
	this.real = a;
	this.image=b;
}
public void displaydata() { 
	System.out.println( real + "+" + image + "i");
}
public complex add (complex z1 , complex z2) {
	complex sum = new complex () ;
	sum.real = z1.real  + z2.real ;
	sum.image = z1.image + z1.image ;
	return sum ; 
}
public class Program_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex c1 = new complex () ;
c1.setdata(3, 5);
complex c2 = new complex () ;
c2.setdata(6, 2);
System.out.println("First number:");
c1.displaydata();
System.out.println("Second number:"); 
complex sum = c1.add(c1, c2);
System.out.println("sum" + " ");
sum.displaydata();
	}
}
}
