package javaPractice;

public class VovelCheck {
	
	public static void main(String args[]) {
		System.out.println(vovelCheck("Hello"));
	}
	
	public static boolean vovelCheck(String inputString) {
		return inputString.toLowerCase().matches(".*[aeiou].*");
	}

}
