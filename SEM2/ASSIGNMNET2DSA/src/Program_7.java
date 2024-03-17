interface DetailInfo  {
	void display () ;
    int count () ; 
}
class PERSON12 implements DetailInfo{ 
	static int maxcount ;
	String  name  ;
	PERSON12(String name){ 
		this.name= name ;
	}		
	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("The name of the person is :" + this.name);
	//System.out.println("count the no. of characters present in the name of the person is :" + max);
	}
	@Override
	public int count() {
return name.length() ;
	}
}
public class Program_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PERSON12 P1 = new PERSON12 ("Soyam") ; 
PERSON12 P2 = new PERSON12("KAJU") ; 
	P1.display();
	System.out.println("The numbers of the characters  in name :" + P1.count()); 
	P2.display();
	System.out.println("The numbers of the characters in name :" + P2.count());
}
	}


