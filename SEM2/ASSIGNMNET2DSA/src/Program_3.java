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
	product [] pro = new product [5] ;
System.out.println("Product Details");
pro[0] = new product (2,3,4) ;
pro[1] = new product (2,3,4) ;
pro[2] = new product (2,3,4) ;
pro[3] = new product (2,3,4) ;
pro[4] = new product (2,3,4) ;
for (int i = 0 ; i < pro.length ; i++ ){
pro[i].display();
	}
	int totalprice =  pro[0].totalprice+ pro[1].totalprice+ pro[2].totalprice+ pro[3].totalprice+ pro[4].totalprice ;
	System.out.println("The total price of the items is " + totalprice);
	}
}
