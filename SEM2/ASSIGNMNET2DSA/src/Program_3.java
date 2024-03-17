class product {  
	int prodId ;
	int price ; 
	int quantity ; 
	// these are Instance variables 
  static  int  totalprice ;
  // these are class variables 
  // class variables + instance variables are called member variables 
  product (int a , int b  , int c ){ 
	  this.prodId = a ;
	  this.price  = b ; 
	  this.quantity = c ;
	  totalprice += price *quantity ;
  }
  void  display () {
	  System.out.println("Product Id is:" + this.prodId);
	  System.out.println("Product Price is:" + this.price);
	  System.out.println("product quantity is;" + this.quantity);
	  System.out.println("Totalprice of the product is:" + totalprice);
  }
  public int  getTotalprice () { 
	  return totalprice ;
}
  }
public class Program_3 {

	public static void main(String[] args) {
	
System.out.println("Product Details");
product p1 = new product (2,3,4) ;
p1.display();
product p2 = new product (2,3,4) ;
p1.display();
product p3 = new product (2,3,4) ;
p1.display();
product p4 = new product (2,3,4) ;
p1.display();
product p5 = new product (2,3,4) ;
p1.display();
System.out.println("Total Payable amount:" + p1.totalprice+p2.totalprice+p3.totalprice+p4.totalprice+p5.totalprice+"INR");
}
}