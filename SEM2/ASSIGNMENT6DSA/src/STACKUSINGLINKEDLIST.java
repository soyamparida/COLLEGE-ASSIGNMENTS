import java.util.Scanner;
class Node {
	        int info;
	        Node next;

	        public Node(int info) {
	            this.info = info;
	            this.next = null;
	        }
	 }
public class STACKUSINGLINKEDLIST {
	 private static Scanner sc = new Scanner(System.in);
	 public static Node push(Node top) { 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter element to push:");
		        int x = sc.nextInt();
		        Node newNode = new Node(x);
		        newNode.next = top;
		        top = newNode;
		        System.out.println(x + " pushed into stack");
		        return top;
		        /*
		         * The stack is initially empty:

csharp
Copy code
top -> null
After First Push Operation
Let's assume the user enters the element 10.

A new node is created with data 10.
The next pointer of the new node is set to the current top (null).
The top is updated to point to the new node.
java
Copy code
top = push(top); // User enters 10
The stack now looks like this:

lua
Copy code
       +-----+
top -> | 10  |
       +-----+
       |  /  |
       +-----+
After Second Push Operation
Now, let's assume the user enters the element 20.

A new node is created with data 20.
The next pointer of the new node is set to the current top (which is the node containing 10).
The top is updated to point to the new node.
java
Copy code
top = push(top); // User enters 20
The stack now looks like this:

lua
Copy code
       +-----+
top -> | 20  |
       +-----+
       |  |  |
       +-----+
         |
         v
       +-----+
       | 10  |
       +-----+
       |  /  |
       +-----+
After Third Push Operation
Finally, let's assume the user enters the element 30.

A new node is created with data 30.
The next pointer of the new node is set to the current top (which is the node containing 20).
The top is updated to point to the new node.
java
Copy code
top = push(top); // User enters 30
The stack now looks like this:

lua
Copy code
       +-----+
top -> | 30  |
       +-----+
       |  |  |
       +-----+
         |
         v
       +-----+
       | 20  |
       +-----+
       |  |  |
       +-----+
         |
         v
       +-----+
       | 10  |
       +-----+
       |  /  |
       +-----+
		         */
		    }
	  public static Node pop(Node top) {
	        if (top == null) {
	            System.out.println("Stack Underflow");
	            return null;
	        }
	        System.out.println("Popped element: " + top.info);
	        top = top.next;// hamesha stack mai first element jo insert hua tha woh null ko point karta h toh last ele,ent jo insert hota h woh next backward hota h 
	        return top;
	    }
	  public static void display(Node top) {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        System.out.println("Elements of the stack are:");
	        Node temp = top;
	        while (temp != null) {
	            System.out.print(temp.info + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int top = -1 ; array case ! not this just for reference
Node top = null;

while (true) {
    System.out.println("****MENU****");
    System.out.println("0:Exit");
    System.out.println("1:Push");
    System.out.println("2:Pop");
    System.out.println("3:Display");
    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    switch (choice) {
        case 0:
        	/*
        	 * What is System.exit(0)?
System.exit(0) is a method call in Java that instructs the Java Virtual Machine (JVM) to terminate the currently running Java application.

        	 */
            System.exit(0);
        case 1:
            top = push(top);
            break;
        case 2:
            top = pop(top);
            break;
        case 3:
            display(top);
            break;
        default:
            System.out.println("Wrong choice");
    }
}
	}

}
