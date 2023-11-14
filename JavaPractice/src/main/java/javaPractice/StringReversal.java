package javaPractice;

public class StringReversal {
	public static void main(String args[]) {
		String inputString = "Apples are red.";
		reverseString(inputString);
		resverseStringWords(inputString);
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
}
