package javaPractice;

public class findSecondLargestNumberInArray {
	public static void main(String args[]) {
		int[] arr = { 4, 7, 1, 9, 3, 5 };
		System.out.println(getSecondLargestNum(arr));
	}
	
	public static int getSecondLargestNum(int[] arr) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if(i > largest) {
				secondLargest = largest;
				largest = i;
			}else if (i> secondLargest) {
				secondLargest = i;
			}
		}
		return secondLargest;
	}
}