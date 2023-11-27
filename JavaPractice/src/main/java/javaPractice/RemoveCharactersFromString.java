package javaPractice;

public class RemoveCharactersFromString {
	public static void main(String args[]) {
		System.out.println(removeChars("abc def", "b"));
	}
	
	public static String removeChars(String inputString, String c) {
		char characterToBeRemoved = c.charAt(0);
		StringBuilder outputString = new StringBuilder();
		for(int i=0; i<=inputString.length()-1; i++) {
			if(inputString.charAt(i) != characterToBeRemoved) {
				outputString.append(inputString.charAt(i));
			}
		}
		return outputString.toString();
	}
}
