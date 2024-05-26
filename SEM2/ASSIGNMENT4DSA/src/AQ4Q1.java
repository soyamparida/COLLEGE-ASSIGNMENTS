import java.util.Scanner ; 
class Node { 
	protected int regd_no ;
	protected float mark ;
	protected Node next  ; 
	
	Node (int regd_no , float  mark){ 
		this.regd_no= regd_no ; 
		this.mark = mark; 
		this.next = null ;
	}
}
public class AQ4Q1 { 
	static Scanner sc = new Scanner (System.in);
public static Node  create (Node start) {
	// here in method Node is there Node create Why ? :- Return Type (Node):
/*
The method returns a Node object. This is important because, in a linked list, when you insert a new node at the beginning, the head of the list changes. The method needs to return the new head of the list, which is of type Node.
*/
	System.out.println("Enter the registration number:");
	int regd_no = sc.nextInt();
	System.out.println("Enter the mark:");
	int mark = sc.nextInt();
	Node newnode = new Node (regd_no , mark) ;
	
	if (start == null) {
		start  = newnode ; 
	}
	else { 
		Node temp = start ; // remember while creating a node if we have some element then we have to add the element to last 
		while (temp != null) { 
			temp= temp.next;
		}
		temp.next= newnode ; 
	}
	return start ; // to check whether the head is in correct position
}
// Q.A)
public static Node insBeg(Node start) { 
System.out.println("Enter the registration number:");
int regd_no = sc.nextInt();
System.out.println("Enter the mark");
int mark = sc.nextInt();
Node newnode = new Node (regd_no , mark ) ; 
	newnode.next =  start ; 
	start = newnode ; 
return start ; 
}
//Q.B)
public static Node inslast(Node start)  {
	System.out.println("Enter the registration number:");
	int regd_no = sc.nextInt();
	System.out.println("Enter the mark");
	int mark = sc.nextInt();
	Node newnode = new Node (regd_no , mark ) ; 
	if (start == null) {
		System.out.println("List is Empty");
		start = newnode ;
	}
	else { 
		Node temp = start ; 
		while (temp != null) { 
			temp = temp.next;
		}
		temp.next = newnode;
	}
	return start ;
}
public static Node insatany(Node start ) { 
	/*
	System.out.println("Enter the registration number:");
	int regd_no = sc.nextInt();
	System.out.println("Enter the mark");
	int mark = sc.nextInt();
	System.out.println("Enter the position");
	int position = sc.nextInt();
	Node newnode = new Node (regd_no , mark ) ; 
	Node temp = start ;
	int count = 1; 
	for (int i = 0 ; i < position - 1  ; i++) { 
		temp = temp.next;
	}
	Node current = temp.next;
	temp.next = newnode  ;
	newnode.next = current; 
}
return start ; 
}
*
*/
	 int regd_no, pos;
     float mark;

     System.out.println("Enter student registration number: ");
     regd_no = sc.nextInt();
     System.out.println("Enter mark secured in the subject: ");
     mark = sc.nextFloat();
     System.out.println("Enter position to insert: ");
     pos = sc.nextInt();

     Node newNode = new Node(regd_no, mark) ;
	if(pos == 1) { 
		newNode.next = start ; 
		start = newNode ; 
	} else {
	Node previous = start ;
	int count = 1; 

	while (count < pos -1 && previous.next != null) { 
		previous = previous.next ; 
		count ++ ;
	}
	Node current = previous.next; 
	previous.next = newNode ;  
	newNode.next = current ;
}
	return start ;
}
public static Node delBeg (Node start) {
	if (start== null) { 
		System.out.println("List is empty");
	}
	else { 
		start = start.next;
	}
	return start.next;
}
public static Node dellast(Node start) { 
	if (start== null) { 
		System.out.println("List is empty");
		return null ;
	}
	 if (start.next == null) {
         return null;
     }
	else { 
		Node temp = start ;
		Node temp1 = start.next;
		while (temp1.next != null) { 
			temp = temp.next;
			temp1 = temp1.next ; 
		}
		temp.next= null ;
	}
	return start;
}
public static Node delany(Node start) {
	System.out.println("Enter the position to delete:");
    int pos = sc.nextInt();
	if (start == null) { 
		System.out.println("List is empty");
	}
	 if (pos <= 0) {
         System.out.println("Invalid position");
         return start;
     }
	 if (pos == 1) {
         return start.next; // Deleting the first node
     }
	Node temp = start ; 
	int count = 1  ;
	for (int i = 1; i < pos -1  ; i++) { 
		if (temp.next == null) {
            System.out.println("Position out of bounds");
            return start;
        }
		temp = temp.next ;
	}
	Node current = temp.next ;
	temp.next = current .next ;
	
	return start ;
}
public static void searchandUpdate(Node start) { 
	 if (start == null) {
         System.out.println("List is empty");
         return;
     }
	System.out.println("Enter the registration number to search:");
	int regd_noo = sc.nextInt();
	Node temp = start ;
	while (temp != null && temp.regd_no != regd_noo) { 
	temp = temp.next ;
}
	if (temp == null) {
        System.out.println("Registration number not found.");
        return;
    }
System.out.println("Enter the mark to update:");
int markupdate = sc.nextInt();
temp.mark = markupdate;
System.out.println("The updated mark is " + temp.mark);
}

public static void sort (Node start) { 
	 if (start == null) {
         System.out.println("List is empty");
         return;
     }
	 Node temp = start ; 
	 int count = 0  ;
	 while (temp != null) { 
		temp = temp.next ; 
		count ++ ;
	 }
	 for (int i = 0 ; i < count - 1 ; i++) { // outer loop :Outer Loop (c - 1 passes): Ensures the entire list is sorted by making multiple passes through the list.
		  Node current = start ;
		  Node next = current.next;
		  /*Why c - 1?
		   * After each pass through the list, the largest unsorted element moves to its correct position.
In a list of c elements, you need c - 1 passes to ensure all elements are sorted. This is because after c - 1 passes, the last element will already be in its correct position due to the previous passes.
*/	   
	for (int j = 0 ; j<count-i-1 ; j++) { 	//nner Loop (c - i - 1 comparisons): Compares and potentially swaps adjacent elements, reducing the number of comparisons as more elements are sorted with each pass.  
		/*
		 * Initial List:

rust
Copy code
head -> [4] -> [1] -> [3] -> [2] -> null
1st Pass (i = 0):

Inner loop runs c - i - 1 = 4 - 0 - 1 = 3 times.
Comparisons and potential swaps:
Compare [4] and [1]: No swap needed.
Compare [1] and [3]: Swap [1] and [3].
Compare [1] and [2]: Swap [1] and [2].
List after 1st pass:
rust
Copy code
head -> [4] -> [3] -> [2] -> [1] -> null
2nd Pass (i = 1):

Inner loop runs c - i - 1 = 4 - 1 - 1 = 2 times.
Comparisons and potential swaps:
Compare [4] and [3]: No swap needed.
Compare [3] and [2]: No swap needed.
List after 2nd pass:
rust
Copy code
head -> [4] -> [3] -> [2] -> [1] -> null
3rd Pass (i = 2):

Inner loop runs c - i - 1 = 4 - 2 - 1 = 1 time.
Comparisons and potential swaps:
Compare [4] and [3]: No swap needed.
List after 3rd pass:
rust
Copy code
head -> [4] -> [3] -> [2] -> [1] -> null
Final List:

rust
Copy code
head -> [4] -> [3] -> [2] -> [1] -> null
		 */
		/*
		Why c - i - 1?

				c is the total number of nodes.
				i is the current pass number of the outer loop.
				c - i - 1 ensures that the inner loop only runs through the unsorted portion of the list. With each pass (i), one more element is sorted and can be excluded from further comparisons.
				*/
		
		if (current.mark < next.mark) {
			float tempmark = current.mark;
			current.mark = next.mark ; 
			next.mark = tempmark;
		}
		current = next ;
		next = current.next ;
	}
	 }

}
public static void display(Node start) {
    if (start == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = start;
    while (temp != null) {
        System.out.println("Registration Number: " + temp.regd_no + ", Mark: " + temp.mark);
        temp = temp.next;
    }
}
public static Node reverse (Node start) { 
	Node prevNode = start ;
	Node currentNode = start.next;
	while (currentNode != null) { 
		Node nextnode = currentNode.next;
		currentNode.next = prevNode;
		
		// update 
		prevNode = currentNode ;
		currentNode = nextnode;
	}
	start.next= null ;
	start = prevNode;
	return start ;
}
public static int count(Node start) {
    int count = 0;
    Node temp = start;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    return count;
}
	public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 Node start = null ; 
while (true) {
    System.out.println("****MENU*****");
    System.out.println("0: Exit");
    System.out.println("1: Creation");
    System.out.println("2: Insert at Beginning");
    System.out.println("3: Insert at End");
    System.out.println("4: Insert at Any Position");
    System.out.println("5: Delete from Beginning");
    System.out.println("6: Delete from End");
    System.out.println("7: Delete from Any Position");
    System.out.println("8: Search and Update Mark");
    System.out.println("9: Sort based on Marks (Descending)");
    System.out.println("10: Count Nodes");
    System.out.println("11: Reverse the List");
    System.out.println("12: Display");
    
    System.out.println("Enter the choice");
 int choice = sc.nextInt();
 switch (choice) { 
 case 0:
	 System.exit(0);
    case 1:
		 start=create(start);
		 break ;
    case 2: 
	start = insBeg(start);
	break ;
    case 3:
	start = inslast(start);
	break ;
	case 4:
		start = insatany(start);
		break ;
	case 5:
		start = delBeg(start);
		break ;
	case 6:
		start = dellast(start);
		break ;
    case 7:
    	start = delany(start);
    	break ;
    case 8:
        searchandUpdate(start);
        break;
    case 9:
        sort(start);
        break;
    case 10:
        System.out.println("Number of nodes: " + count(start));
        break;
    case 11:
       start =  reverse(start);
        break;
    case 12:
        display(start);
        break;
    default:
        System.out.println("Wrong choice");
        
 }
}
/*
Guys writing 300+ codes is not a joke , it took so much time and efforts ! 
So atleast try to give credits and  your credits will really matter <3
Thank you !:D
*/
	}
}
