package javaPractice;

// Check if a string is palindrome i.e "madam" it will spell same even after reversing the string.

public class Palindrome {
	
	public static void main(String args[]) {
		String input = "madam";
		checkPalindrome(input);
	}
	
	public static void checkPalindrome(String str) {
		// Reverse the string.
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length()-1; i>=0; i--) {
			reversedString.append(str.charAt(i));
		}
		if(reversedString.toString().equals(str)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("Not a palindrom String");
		}
	}
}
