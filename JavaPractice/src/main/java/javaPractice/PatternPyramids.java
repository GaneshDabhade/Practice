package javaPractice;

public class PatternPyramids {

	public static void main(String[] args) {
		halfPyramid(5);
		System.out.println("------------------------------------------------------");
		invertedHalfPyramid(5);
		System.out.println("------------------------------------------------------");
		pattern3(5);
		System.out.println("------------------------------------------------------");
		pattern4(5);
		System.out.println("------------------------------------------------------");
		pattern5(5);
		System.out.println("------------------------------------------------------");
	}

	// Half pyramid.	
	//	* 
	//	* * 
	//	* * * 
	//	* * * * 
	//	* * * * * 
	public static void halfPyramid(int rows) {
		// Initial for loop is to handle rows.
		for(int i=0; i<=rows-1; i++) {			
			// Below for loop is for printing stars in columns
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// Inverted half pyrmaid 
	//	* * * * * 
	//	* * * * 
	//	* * * 
	//	* * 
	//	* 
	public static void invertedHalfPyramid(int rows) {
	    for (int i = rows; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	// Print Diamond
	//    * 
	//   * * 
	//  * * * 
	// * * * * 
	//* * * * * 
	
	public static void pattern3(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int k=1; k<=(rows-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// Print left hand pyramid (Only difference is space removed from 8 printing).
	//    *
	//   **
	//  ***
	// ****
	//*****
	
	public static void pattern4(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int k=1; k<=(rows-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//	*****
	//	 ****
	//	  ***
	//	   **
	//	    *
	
	public static void pattern5(int rows) {
		for(int i=0; i<=rows; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}			
			for(int j=1; j<=(rows-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
