
public class HAQ2 {
	// Recursive method for binary search
	public static int binarySearch(int [] array , int target , int low , int high) { 
		// Base case: if the low boundary is greater than the high boundary, target is not found
		if (low > high) { 
			return -1 ; 
		}
		// calculate the middle index 
		int mid = low + (high - low)  / 2; // To prevent overflow
		
		 // Check if the target is at the middle
		if (array[mid] == target) { 
			return mid ; // Return the index where the target is found
		}
		// If the target is smaller than the middle element, search the left half
        if (array[mid] > target) {
        	return binarySearch(array, target, low,mid-1);
        }
        // Otherwise, search the right half
        return binarySearch(array, target, mid + 1, high);
	}
public static void main(String[] args) {
/*
 The recursive binarySearch method takes the following parameters:
array: The sorted array where we're searching.
target: The element to find.
low: The lower boundary of the search interval.
high: The upper boundary of the search interval.
If low > high, the target is not in the array, and the method returns -1.
Otherwise, the method calculates the middle index (mid) and checks if the target is there.
If the target is less than the middle element, the search continues in the left half (binarySearch(array, target, low, mid - 1)).
If the target is greater, the search continues in the right half (binarySearch(array, target, mid + 1, high)).
The main method demonstrates searching for an element in a sorted array and outputs whether the element is found and its index if it is.
 */
// Sorted array  
	int [] sortedArray = { 1 , 3 , 5 , 7 ,9 ,11 , 13 , 15 , 17 } ;
// Element to search for 
	int target = 7 ;
// Perform binary search 
	int index  = binarySearch(sortedArray , target , 0 , sortedArray.length-1);
	// output the result  
	if (index != -1) { 
		System.out.println("Element" + target + "found at index:" + index);
	}else { 
		System.out.println("Element" + target + "not found in the array.");
		
	}
	System.out.println(sortedArray.length);
	}
}
