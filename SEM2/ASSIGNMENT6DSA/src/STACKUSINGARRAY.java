import java.util.Scanner ;
class Stack2 
{
    static final int MAX = 1000;
    public static int push(int S[], int top) {
        if (isFull(top)) {
            System.out.println("Stack Overflow");
            return top; // return top unchanged
        } else {
        	Scanner sc = new Scanner (System.in);
            S[++top] = sc.nextInt();
            System.out.println(S[top] + " pushed into stack");
            return top;
            // HERE IS WHY WE RETURNED TOP
            /*
            Maintaining State: The top variable tracks the current top position of the stack. After pushing an element, the top index is incremented to point to the new top element. Returning this updated value ensures that the caller knows the current state of the stack.
            In a typical stack implementation, various operations like push, pop, peek, etc., rely on the top index. By returning the updated top value after each operation, you maintain the correct stack state across different operations.
*/

        }
    }

    public static int pop(int S[], int top) {
    	
        if (isEmpty(top)) {
            System.out.println("Stack Underflow");
            return -1; // return -1 indicating underflow
        } else {
            int x = S[top--];
            System.out.println("Popped element: " + x);
            return top;
        }
        
    }
    public static void display(int S[],int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements of the stack are:");
            for (int i = 0; i <= top; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }
        public static boolean isEmpty(int top) {
            return (top == -1);
        }

        public static boolean isFull(int top) {
            return (top == MAX - 1);
        }

public class STACKUSINGARRAY {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int stack[] = new int[MAX];
	        int top = -1 ; 
	        while (true) {
	            System.out.println("***MENU***");
	            System.out.println("0: Exit");
	            System.out.println("1: Push");
	            System.out.println("2: Pop");
	            System.out.println("3: Display");
	            System.out.println("Enter your choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 0:
	                    System.exit(0);
	                case 1:
	                    top = push(stack, top);
	                    break;
	                case 2:
	                    top = pop(stack, top);
	                    break;
	                case 3:
	                    display(stack, top);
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	    }
	}

}
}
