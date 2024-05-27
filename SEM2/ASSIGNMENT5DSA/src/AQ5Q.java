import java.util.Scanner;
class Node{ 
	int regd_no ; 
	float mark ; 
	Node next; 
	Node prev  ; 
	public Node(int regd_no , float mark) {
		// TODO Auto-generated constructor stub
		this.regd_no  = regd_no;
		this.mark = mark ; 
		this.next = null ;
		this.prev = null ; 
	}
}
public class AQ5Q {
	
	static Scanner sc = new Scanner (System.in);
// Q)A 
public static Node insbeg (Node start , Node end ) { 	
	 System.out.print("Enter registration number: ");
     int regd_no = sc.nextInt();
     System.out.print("Enter mark: ");
     float mark = sc.nextFloat();
     Node newnode = new Node(regd_no, mark);
	if (start == null) { 
		// If the list is empty, both start and end should point to the new node
		start = newnode ;
		end = newnode ;

	} else {
		 // Insert the new node at the beginning
		newnode.next = start ;
		start.prev = newnode;
		start = newnode;
	}
	return start;// also same as newnode cause newnode will return the same value as the start = insbeg(start , end)
}
public static Node inslast(Node start , Node end) { 
	 System.out.print("Enter registration number: ");
     int regd_no = sc.nextInt();
     System.out.print("Enter mark: ");
     float mark = sc.nextFloat();
     Node newNode = new Node(regd_no, mark);
     if (end == null) {
         start = newNode;
     } else {
         end.next = newNode;
         newNode.prev = end;
     }
     return newNode;
 }

public static Node insatany(Node start , Node end) { 
	System.out.print("Enter registration number: ");
    int regd_no = sc.nextInt();
    System.out.print("Enter mark: ");
    float mark = sc.nextFloat();
    System.out.print("Enter position: ");
    int pos = sc.nextInt();
    Node newnode = new Node(regd_no, mark);
    /*
    if (start == null) { 
    	System.out.println("List is empty");
    }
    */ // this condition is anywats covered 
    if (pos == 1 ) { 
    	return insbeg(start, end);
    }
   Node temp = start;
   for (int i = 1; i < pos ; i++) {
       if (temp == null) {
           System.out.println("Position out of bounds");
           return start;
       }
       temp = temp.next;
   }
   newnode.next = temp.next;
   newnode.prev = temp;
   if (temp.next != null) {
       temp.next.prev = newnode;
   }
   temp.next = newnode;
return start;
}

public static Node delBeg (Node start , Node end) { 
if (start == null) { 
	System.out.println("List is empty");
	return null ;
}
if (start.next == null) {
	start = null ;
    end = null;
    return null;
}else { 
	
	 start = start.next; // Move head to the next node
     start.prev = null;  // Set the previous pointer of the new head to null
}
return start ;
}

public static Node delend (Node start , Node end ) { 
	if (start == null) { 
		System.out.println("list is empty");
		return null ;
	}
	if (start.next == null) { 
		 System.out.println("Deleted node: " + start.regd_no + " " + start.mark);
		start = null ;
		end = null ;
		return start;
	}
	else {
		Node secondlastnode = start ;
		Node lastnode = start.next;
		while (lastnode.next != null) {
			secondlastnode = secondlastnode.next;
			lastnode = lastnode.next ;
		}
		 System.out.println("Deleted node: " + lastnode.regd_no + " " + lastnode.mark);
		secondlastnode.next=null ;
		end = secondlastnode ;
	}
	return end;
}
public  static  Node delany (Node start, Node end) {
	/*
	 System.out.print("Enter position: ");
     int pos = sc.nextInt();
     if (pos == 1) {
         return delBeg(start, end);
     }
     Node temp = start;
     for (int i = 1; i < pos - 1; i++) {
         if (temp == null) {
             System.out.println("Invalid position");
             return start;
         }
         temp = temp.next;
     }
     if (temp.next == null) {
         System.out.println("Invalid position");
         return start;
     }
     Node del = temp.next;
     if (del == end) {
         end = temp;
     } else {
         temp.next = del.next;
         del.next.prev = temp;
     }
     System.out.println("Deleted node: " + del.regd_no + " " + del.mark);
     return start;
 }
 */ System.out.print("Enter registration number to delete: ");
 int regd_no = sc.nextInt();

 Node temp = start;
 while (temp != null && temp.regd_no != regd_no) {
     temp = temp.next;
 }
 if (temp == null) {
     System.out.println("Node not found");
     return start;
 }
   if (temp.prev != null) {
     temp.prev.next = temp.next;
 } else {
    start = temp.next;
 }
 if (temp.next != null) {
     temp.next.prev = temp.prev;
 } else {
    end = temp.prev;
 }

 /*
  * Example Scenario:
Initial List: 101 ↔ 102 ↔ 103 ↔ 104

Delete Node with regd_no 102:

temp starts at head (101).
First iteration: temp is 101 (not null, and regd_no is not 102), so move to the next node.
Second iteration: temp is 102 (not null, and regd_no is 102), so the loop exits.
Update Pointers:

temp (102) is not the head and not the tail.
Update 101's next to point to 103.
Update 103's prev to point to 101.
Resulting List: 101 ↔ 103 ↔ 104

Using && ensures that the loop handles the list traversal safely and efficiently.
  */
 return start;
}
public static void searchandUpdate (Node start) { 
	 System.out.print("Enter registration number to search: ");
     int regd_no = sc.nextInt();
     Node temp = start ;
     while (temp != null) { 
    	 if (temp.regd_no == regd_no) { 
    		 System.out.print("Enter registration number to search: ");
    	       temp.mark = sc.nextInt();
    	       System.out.println("Mark updated successfully.");
               return;
    	 }
    	 temp = temp.next;
     }
     System.out.println("Error: Registration number not found.");
}
public static void display(Node start , Node tail) { 
	Node temp = start;
    if (temp == null) {
        System.out.println("List is empty.");
        return;
    } System.out.println("Regd no. \tMark");
    while (temp != null) {
        System.out.println(temp.regd_no + "\t\t" + temp.mark);
        temp = temp.next;
    }
}
public static void displayMenu() {
    System.out.println("Menu:");
    System.out.println("1. Insert at the beginning");
    System.out.println("2. Insert at the end");
    System.out.println("3. Insert at any position");
    System.out.println("4. Delete from the beginning");
    System.out.println("5. Delete from the end");
    System.out.println("6. Delete from any position");
    System.out.println("7. Search and update mark");
    System.out.println("8. Display all nodes");
    System.out.println("9. Exit");
    System.out.print("Enter your choice: ");
}
public static void main(String[] args) {
	  Node start = null;
      Node end  = null;
      int choice;

      do {
          displayMenu();
          choice = sc.nextInt();

          switch (choice) {
              case 1:
                  start = insbeg(start, end);
                  if (start == null) {
                      end = start;
                  }
                  break;
              case 2:
                  end =  inslast(start, end);
                  if (start == null) {
                      start = end;
                  }
                  break;
              case 3:
                  start = insatany(start , end );
                  break;
              case 4:
                  start = delBeg(start , end);
                  break;
              case 5:
                   end = delend(start , end);                                                                            
                  break;
              case 6:
                 start = delany(start , end);
                  break;
              case 7:
                  searchandUpdate(start);
                  break;
              case 8:
                  display(start , end );
                  break;
              case 9:
                  System.out.println("Exiting...");
                  break;
              default:
                  System.out.println("Invalid choice!");
          }

      } while (choice != 9);
  }
}
