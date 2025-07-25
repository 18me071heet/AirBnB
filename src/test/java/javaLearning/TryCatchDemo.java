package javaLearning;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		
	    int number = sc.nextInt();
	    
	    try {
	    	
	    	int total = 10/number ;                         // Statement that may throw any Arithmetic exception
	    	System.out.println(total);
	    }
	    
	    catch(ArithmeticException e) {
	    	
	    	System.out.println("Data not proper");              // Statement that handle the exception
	    }
	    
	    
	    int arr[]= {1,2,3,4};
	    
	    try {
	        System.out.println(arr[3]);                   // Statement that may throw any ArrayIndexOutOfBounds exception

	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	    	
	    	System.out.println(e.getMessage());
	    }
	    
	    
	    String s=null;
	    		
	    		try {
	    		
	    			System.out.println(s.length());               // Statement that may throw any NullPointer Exception
	    		}
	    		
	         catch(NullPointerException e) {
	    	
	        	 System.out.println(e.getMessage());
	    	
	    }
	
	}

}
