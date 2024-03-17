class Deposit {
	long Principal ; 
	int Time ; 
	double rate ;
	double totalamount ; 
	Deposit () {
		this.Principal = 0 ;
		this.Time = 0 ; 
		this.rate = 0 ;
		this.totalamount = 0 ; 
	}
	Deposit (long Principal , int Time , double rate ){
		this.Principal = Principal ;
		this.Time = Time ; 
		this.rate = rate ;
		calcAmt();
	}
	Deposit (long Principal , int Time) {
		this.Principal = Principal ;
		this.Time = Time ;
		calcAmt();
	}
	
	Deposit (long principal , double rate){ 
		this.Principal = principal ; 
		this.rate = rate ;
		calcAmt(); 
	}
	public void display () {
		System.out.println("The principal amount is:" + Principal);
		System.out.println("The Time is:" + Time );
		System.out.println("The rate is:" + rate);
		System.out.println("The  totalamount is:" + totalamount);
	}/*
	public double totalamount () {
		return Principal + (Principal*rate*Time) / 100 ;
		*/ // also works 
	
	public void calcAmt() { 
	this.totalamount= Principal + (Principal * rate * Time) / 100 ; 	
}

public class Program_4 { 
	public static void main(String[] args) {
		Deposit deposit1 = new Deposit (322123, 56 , 55.3);
		System.out.println("Deposit 1 is:");
		deposit1.display();
		Deposit deposit2 = new Deposit(54675467,45);
		System.out.println("Deposit 2 is:");
		deposit2.display();
		Deposit deposit3 = new Deposit(675676,99.9);
		System.out.println("Deposit 3 is:");
		deposit3.display(); 
		
	
	}
}
}