package javaPractice;

import java.util.Arrays;

// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
// For example, “listen” and “silent” are an anagram of each other.

public class Anagram {
	public static void main(String args[]) {
		String string1 = "listen";
		String string2 = "silent";
		checkAnagram(string1, string2);
	}

	public static void checkAnagram(String str1, String str2) {
		// Convert both the string to a string array first.
		char[] strArr1 = str1.toCharArray();
		char[] strArr2 = str2.toCharArray();

		// validate the length of both the arrays.
		if(strArr1.length == strArr2.length) {
			// Sort both the arrays and compare them.
			Arrays.sort(strArr1);
			Arrays.sort(strArr2);
			if(Arrays.equals(strArr1, strArr2)) {
				System.out.println("Strings are Anagram");
			}else {
				System.out.println("Strings are not Anagram");
			}
		}
	}
}