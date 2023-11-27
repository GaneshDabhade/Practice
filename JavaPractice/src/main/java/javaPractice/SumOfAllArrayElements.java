package javaPractice;

public class SumOfAllArrayElements {	
	public static void main(String args[]) {
		int[] array = {0,1,5,3,6,4};
		System.out.println(sumOfArrayEle(array));
	}
	
	public static int sumOfArrayEle(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
}
