class Book { 
	String bName; 
	int Edition;
	int Bprice ; 
	Book(String bName ,int Edition , int Bprice){ 
		this.bName = bName;
		this.Edition = Edition ;
		this.Bprice = Bprice ; 
	}
	public void todisplay () { 
		System.out.println("The name of the book is:" + bName);
		System.out.println("The Edition of the book is:" + Edition);
		System.out.println("The price of the book:" + Bprice);
	}
	int getprice () { 
		return Bprice ;
	}
}
public class as2hq2 {
public static void main(String[] args) {

	Book [] books = new Book[5] ;
	
	//Creating 5 different books 
    books[0] = new Book("Book1", 1, 20);
    books[1] = new Book("Book2", 2, 15);
    books[2] = new Book("Book3", 3, 30);
    books[3] = new Book("Book4", 1, 25);
    books[4] = new Book("Book5", 2, 18);
    Book maxPriceBook = books[0];
    for (int i = 1; i < books.length; i++) {
        if (books[i].getprice() > maxPriceBook.getprice()) {
            maxPriceBook = books[i];
        }
}
    maxPriceBook.todisplay();
}
}
