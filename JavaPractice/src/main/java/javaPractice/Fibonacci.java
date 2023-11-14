package javaPractice;

public class Fibonacci {
	public static void main(String args[]) {
		int n = 10;
		generateFibonacciSeries(n);
	}
	
	public static void generateFibonacciSeries(int n) {
		int a = 0, b = 1;
		
		for (int i = 0; i<=n; i++) {
			System.out.println(a+" ");
			int sum = a+b;
			a = b;
			b = sum;
		}
	}

}
