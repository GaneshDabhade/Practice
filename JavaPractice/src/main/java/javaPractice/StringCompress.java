package javaPractice;


// Here User will input the string like "aaabbrrtttt" and expected output is a3b2r2t4.

public class StringCompress {
	public static void main(String args[]) {
		String inputString = "aaabbrrtttt";		
		compressString(inputString);
	}	
	
	public static void compressString(String input) {
		int count = 1;
		StringBuilder output  = new StringBuilder();
		for(int i=0; i<input.length()-1; i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				count = count+1;
			}else {
				output.append(input.charAt(i));
				output.append(count);
				count=1;
			}
		}		
		output.append(input.charAt(input.length()-1));
		output.append(count);		
		System.out.println(output);
	}
}
