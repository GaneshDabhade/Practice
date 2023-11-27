package javaPractice;

public class Fibonacci {
	public static void main(String args[]) {
		int n = 10;
		generateFibonacciSeries(n);
	}
	
	public static void generateFibonacciSeries(int n) {
		int a = 0, b = 1, c = 1;
		
		for (int i = 0; i<=n; i++) {
			System.out.println(a+" ");
			a = b;
			b = c;
			c = a+b;
		}
	}

}
