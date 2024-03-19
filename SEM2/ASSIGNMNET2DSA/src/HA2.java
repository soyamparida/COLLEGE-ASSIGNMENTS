class Book { 
String BName ;	
int Bedition ; 
int BPrice ; 
                                                                                                                                                                                                                                                                                                                                                                                                                                    
 Book (String BName  , int Bedition , int BPrice ){
this.BName = BName ;	
this.Bedition = Bedition ;
this.BPrice = BPrice  ;
}
 public  double todisplay () { 
	 System.out.println("Book information as follows :");
	 System.out.println("The book name is" + BName);
	 System.out.println("The edition of the book is:" + Bedition );
	 System.out.println("The price of the book is:"  +   BPrice);
	return BPrice;
 }
 
}
public class HA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] books = new Book[5] ;
		/*
		//Creating 5 different books 
	    books[0] = new Book("Book1", 1, 20.50);
        books[1] = new Book("Book2", 2, 15.75);
        books[2] = new Book("Book3", 3, 30.00);
        books[3] = new Book("Book4", 1, 25.25);
        books[4] = new Book("Book5", 2, 18.90);
        Book maxPriceBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > maxPriceBook.getPrice()) {
                maxPriceBook = books[i];
                */
            }
	}
