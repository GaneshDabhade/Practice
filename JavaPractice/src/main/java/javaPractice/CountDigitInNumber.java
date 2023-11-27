package javaPractice;

public class CountDigitInNumber {
	public static void main(String args[]) {
		System.out.println(countDigits(123456));
	}
	
	public static int countDigits(int digit) {
		int count = 0;
		while(digit != 0) {
			digit = digit/10;
			count++;
		}
		return count;
	}
}
