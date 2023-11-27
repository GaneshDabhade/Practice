package javaPractice;

public class StringReversal {
	public static void main(String args[]) {
		String inputString = "Apples are red.";
//		reverseString(inputString);
//		resverseStringWords(inputString);
		reverseString1(inputString);
		reverseEachWord(inputString);
	}
	
	
	// Reverse Entire String.
	public static void reverseString(String stringInput) {
		StringBuilder outputString = new StringBuilder();
		for(int i=stringInput.length()-1; i>=0; i-- ) {
			outputString.append(stringInput.charAt(i));
		}
		System.out.println(outputString);
	}
	
	// Reverse single word from string
	public static void resverseStringWords(String stringInput){
		String[] stringArray = stringInput.split(" ");
		StringBuilder outputString = new StringBuilder();
		for(int i=stringArray.length-1; i>=0; i--) {
			outputString.append(stringArray[i]+" ");
		}
		System.out.println(outputString);
	}
	
	
	public static void reverseString1(String input) {
		StringBuilder outputString = new StringBuilder();
		for(int i=input.length()-1; i>=0; i--) {
			outputString.append(input.charAt(i));
		}
		System.out.println(outputString);
	}
	
	public static void reverseEachWord(String input) {
		StringBuilder outputString = new StringBuilder();
		String[] inputArray = input.split(" ");
		for(int i=inputArray.length-1; i>=0; i--) {
			outputString.append(inputArray[i]+" ");
		}
		System.out.println(outputString);
	}
}
