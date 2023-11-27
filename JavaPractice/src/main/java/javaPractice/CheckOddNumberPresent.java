package javaPractice;

public class CheckOddNumberPresent {
	public static void main(String args[]) {
		int[] numList = {0,1,2,3,4,5,6};
		System.out.println(isOddNumPresent(numList));		
	}
	
	public static boolean isOddNumPresent(int[] numList){
		for(int i:numList) {
			if(i%2 == 0) {
				return false;
			}
		}		
		return true;
	}
}
