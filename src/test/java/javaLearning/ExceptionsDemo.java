package javaLearning;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		
		int total = 100/number;                                        // Arithmetic Exception while entering 0
		System.out.println("The pogram completed :"+total);
		
		
	    int a[] = new int[4];
	   
	    System.out.println("Enter Position:");
	    int pos = sc.nextInt();
	   
	   
	    System.out.println("Enter Value:");
	    int value = sc.nextInt();
	   
	    a[pos]=value;
	    
	    System.out.println(a[pos]);                                    // Array Index out of Bound Exception
	   
	   
	  // String s = "Welcome";                                         // Number Format Exception
	   
	  // int num = Integer.parseInt(s);
	  // System.out.println(num);
	   
	   
	   String s2=null;                                               // Null Pointer Exception 
	   System.out.println(s2.length());
		
	}

}
