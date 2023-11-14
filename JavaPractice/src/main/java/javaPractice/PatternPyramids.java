package javaPractice;

public class PatternPyramids {

	public static void main(String[] args) {
		halfPyramid(5);
	}

	// Half pyramid.	
	//*
	//**
	//***
	//****
	//*****
	public static void halfPyramid(int rows) {
		for(int i=0; i<=rows-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
