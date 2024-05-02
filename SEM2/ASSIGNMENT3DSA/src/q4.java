class genericBox <T> {
	private T contents  ;
	public genericBox(T contents) {
		this.contents = contents ;
	}
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	
}
public class q4 {
public static void main(String[] args) {
	// for boxed one String type 
	// Create a boxed String object
	/*
	genericBox <String> Box1= new genericBox("Hello");
	// Two variables referring to the same string box
	String  Box2 = Box1.getContents();
	System.out.println("The box1 is ");
    Box1.getContents();
System.out.println("The box2 is"); 
System.out.println(Box2);
	 // Change the contents of Box1
	Box1.setContents("hii");
	System.out.println("The Box1 is "); 
	Box1.getContents();
	System.out.println("The Box2 is");
	System.out.println(Box2);
	*/
   // for boxed one Integer type 
	genericBox<Integer> intt , int1 ;
intt = new genericBox<>(87);
int1 = intt ;
System.out.println("The intt value is:");
System.out.println(intt.getContents());
System.out.println("The int1 value is:");
System.out.println(int1.getContents());
intt.setContents(34);
System.out.println("The intt value is:");
System.out.println(intt.getContents());
System.out.println("The int1 value is:");
System.out.println(int1.getContents());
// for 	box with object  in same box 
genericBox<Object> box1 , box2; 
box1 = new genericBox<>("Initial");
box2 = box1 ;
System.out.println("The value of the object box1 is:");
System.out.println(box1.getContents());
System.out.println("The value of the  object box2 is:");
System.out.println(box2.getContents());	
box1.setContents("Final");
System.out.println("The value of the updated object box1 is ");
System.out.println(box1.getContents());
System.out.println("The value of the updarted object box2 is ");
System.out.println(box2.getContents());
}
}
