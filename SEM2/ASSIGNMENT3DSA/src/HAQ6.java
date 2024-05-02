 
public class HAQ6 {
	public static boolean ispalindrome(String s) {
		// Normalize the string to ignore case and whitespace (optional)
		s = s.replaceAll("\\s+", "").toLowerCase(); //// Remove spaces and convert to lowercase
		
		// // Base case: If the string is empty or has only one character, it's a palindrome
		if (s.length() <= 1) { 
			return true  ;
		}
		//Recursive case: Check the first and last characters
		if (s.charAt(0) != s.charAt(s.length()-1)) {
		return false  ; 
	}
	return ispalindrome(s.substring(1,s.length()-1));
}

	// Recursive method to determine if a string is a palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Normalize the string to ignore case and whitespace (optional)
		 // Loop over the array using a standard for loop (without "for-each")
		 String[] testStrings = {
		            "racecar",
		            "gohangasalamiimalasagnahog",
		            "level",
		            "world",
		            "A man a plan a canal Panama", // With spaces and case variations
		            "No lemon no melon"
		        };
        for (int i = 0; i < testStrings.length; i++) {
            String s = testStrings[i]; // Get the current string to test
            boolean isPalin = ispalindrome(s); // Check if it's a palindrome
            System.out.println("\"" + s + "\" is a palindrome: " + isPalin); // Output result
	}
        /*
         * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forwards and backwards (ignoring punctuation, case, and spaces). To determine if a given string is a palindrome, you can create a recursive method in Java. The key idea is to compare the first and last characters of the string and then recursively check the inner part of the string.
         */
}
}
