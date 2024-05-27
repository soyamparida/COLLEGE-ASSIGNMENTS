import java.util.Scanner ;
public class QUEUEUSINGARRAY {
	 public static final int MAX = 5;
	    public static int front = -1;
	    public static int rear = -1;

	    public static void insert(int Q[]) {
	        if (isFull()) {
	            System.out.println("Queue is full");
	        } else {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter element to insert:");
	            int x = sc.nextInt();
	            if (rear == -1) { // if empty front will be  0 and fixed 
	                front = rear = 0;
	            } else {
	                rear = (rear + 1) % MAX;// in array it starts from 0 to 4 
	                /*// agar not divisible return that number if div then 0
* For the example 
3
%
5
3%5:

When 3 is divided by 5, the quotient is 0 because 5 is greater than 3 and cannot be contained within it even once.
The remainder is 3 because there are no multiples of 5 that can be subtracted from 3, so 3 itself is the remainder.
	                 */
	            }
	            Q[rear] = x;
	            System.out.println(x + " inserted into queue");
	        }
	    }
	        public static void delete(int Q[]) {
		        if (isEmpty()) {
		            System.out.println("Queue is empty");
		        } else {
		            int deletedElement = Q[front];
		            if (front == rear) {// means we have one element 
		                front = rear = -1;
		            } else {
		                front = (front + 1) % MAX;
		            }
		            System.out.println("Deleted element: " + deletedElement);
		        }
		    }

		    public static void display(int Q[]) {
		        if (isEmpty()) {
		            System.out.println("Queue is empty");
		        } else {
		            System.out.println("Elements of the queue are:");
		            int i = front;// we cant use rear because in the index of the last element updated
		            do {
		                System.out.print(Q[i] + " ");
		                i = (i + 1) % MAX;
		            } while (i != (rear + 1) % MAX);//jab tak rear == front == 0 nhi hota:D
		            System.out.println();
		        }
		    }

		    public static boolean isFull() {
		        return (rear + 1) % MAX == front;
		        /*
		         *  Queue is full
	front = 0, rear = 4
	Queue: [10, 20, 30, 40, 50]
	Next position of rear: (4 + 1) % 5 = 0
	Since 0 == 0 (0 is equal to front), the queue is full.
		         */
		    }

		    public static boolean isEmpty() {
		        return front == -1 && rear == -1;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

	}

}
